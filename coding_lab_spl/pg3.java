import java.util.LinkedList;

public class pg3 {
	public static LinkedList<String> reverse(LinkedList<String>ll) {
		for(int i=0;i<ll.size()/2;i++) {
			//String str=ll.get(i);
			//ll.set(i, ll.get(ll.size()-i-1));
			//ll.set(ll.size()-i-1, str);
			ll.set(ll.size()-i-1, ll.set(i, ll.get(ll.size()-i-1)));	
		}
		return ll;
	}
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("AAA");
		ll.add("BBB");
		ll.add("CCC");
		ll.add("DDD");
		ll.add("EEE");
		System.out.println("Before reversing :: "+ll);
		System.out.println("After reversing :: "+reverse(ll));
	}
}