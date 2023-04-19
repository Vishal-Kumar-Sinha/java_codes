import java.util.*;
public class pg16 {
	public static HashMap<String, Integer> contactlist=new HashMap<>();
	static void checkKey(String k) {
		if(contactlist.containsKey(k)) {
			System.out.println(k+" exists in the hashmap.");
		}
		else System.out.println(k+" doesn't exist in the hashmap.");
	}
	static void checkValue(int a) {
		if(contactlist.containsValue(a)) {
			System.out.println(a+" exists in the hashmap.");
		}
		else System.out.println(a+" doesn't exist in the hashmap.");
	}
	static void getMap() {
		System.out.println("Hashmap using iterator :: ");
		Iterator<String> i1=contactlist.keySet().iterator();
		while(i1.hasNext()) {
			String str=i1.next();
			System.out.println(str+"="+contactlist.get(str));
		}
	}
	public static void main(String[] args) {
		contactlist.put("vishal", 923292);
		contactlist.put("gopal", 927851);
		contactlist.put("nepal", 861292);
		String k="nepal";
		checkKey(k);
		int a=927851;
		checkValue(a);
		getMap();
	}

}
