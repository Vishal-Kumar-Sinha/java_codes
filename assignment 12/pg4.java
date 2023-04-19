class Q {
	int n;
	boolean setvalue=false;
	synchronized int get() {
		if(!setvalue) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println("I'm in Exception \nException = "+e);
			}
		}
		System.out.println("Got :: "+n);
		setvalue=false;
		notify();
		return n;
	}
	synchronized void put(int n) {
		if(setvalue) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println("I'm in Exception \nException = "+e);
			}
		}
		this.n=n;
		setvalue=true;
		System.out.println("Put :: "+n);
		notify();
	}
}
class Producer implements Runnable {
	Q q;
	Producer(Q q) {
		this.q=q;
		new Thread(this,"Producer").start();
	}
	public void run() {
		int i=1;
		for(int k=0;k<10;k++) {//while(true) {
			q.put(i++);
		}
	}
}
class Consumer implements Runnable {
	Q q;
	Consumer(Q q) {
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	public void run() {
		for(int k=0;k<10;k++) {//while(true) {
			q.get();
		}
	}

}
public class pg4 {
	public static void main(String[] args) {
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
	}
}