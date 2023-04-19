import java.util.*;

public class pg8 {

	public static void main(String[] args) {
		ArrayList<Object> ll=new ArrayList<>(50);
		ll.add(Arrays.asList("Name","Weight","Price"));
		ll.add(Arrays.asList("AAA","50g","Rs.999"));
		ll.add(Arrays.asList("BBB","140g","Rs.525"));
		ll.add(Arrays.asList("CCC","500g","Rs.9865"));
		ll.add(Arrays.asList("DDD","20g","Rs.468"));
		ll.add(Arrays.asList("EEE","5Kg","Rs.5999"));
		//System.out.println(ll);
		System.out.println("Size before trimming :: "+ll.size());
		ll.trimToSize();
		System.out.println("Size after trimming :: "+ll.size());
		System.out.println("Arraylist :: \n"+ll);
	}
}