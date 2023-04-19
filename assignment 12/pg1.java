class Mythread1 implements Runnable {
	Thread t;
	Mythread1() {
		t=new Thread(this,"Mythread1");
		t.start();
	}
	public void run() {
		try {
			for(int i=21;i<=25;i++) {
				System.out.print("  "+i);
				Thread.sleep(500);
			}
		}
		catch(Exception e) {
			System.out.println("Exception : "+e);
		}
	}
}
class Mythread2 extends Thread {
	Mythread2() {
		super("Mythread");
		start();
	}
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.print("  "+i);
				Thread.sleep(500);
			}
		}
		catch(Exception e) {
			System.out.println("Exception : "+e);
		}
	}
}
public class pg1 {
	public static void main(String[] args) {
		new Mythread1();
		new Mythread2();
		try {
			for(int i=11;i<=15;i++) {
				System.out.print("  "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Exception : "+e);
		}
	}

}
