class Order {
	synchronized void placeorder(int n) {
		System.out.println("Order quantity :: "+n);
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {
			System.out.println("I'm in Exception \nException = "+e);
		}
		System.out.println("Order placed...");
	}
}
class Stock implements Runnable {
	int n;
	Order o;
	Thread t;
	Stock(Order o,int n) {
		this.o=o;
		this.n=n;
		t=new Thread(this);
		t.start();
	}
	public void run() {
		o.placeorder(n);
	}
}
public class pg3 {
	public static void main(String[] args) {
		Order o=new Order();
		Stock a=new Stock(o,1200);
		Stock b=new Stock(o,500);
		Stock c=new Stock(o,2000);
		try {
			a.t.join();
			b.t.join();
			c.t.join();
		}
		catch(Exception e) {
			System.out.println("I'm in Exception \nException = "+e);
		}
	}

}
