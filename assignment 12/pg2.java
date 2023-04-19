class Clicker implements Runnable {
	int click=0;
	Thread t;
	private volatile boolean running=true;
	Clicker(int p) {
		t=new Thread(this);
		t.setPriority(p);
	}
	public void run() {
		while(running) {
			click++;
		}
	}
	public void stop() {
		running=false;
	}
	public void start() {
		t.start();
	}
}
public class pg2 {
	public static void main(String[] args) {
		Clicker hi=new Clicker(7);
		Clicker lo=new Clicker(3);
		lo.start();
		hi.start();
		try {
			Thread.sleep(10000);
		}
		catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		lo.stop();
		hi.stop();
		try {
			hi.t.join();
			lo.t.join();
		}
		catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		System.out.println("Low priority thread  :: "+lo.click);
		System.out.println("High priority thread :: "+hi.click);
	}
}
