import java.util.*;
//import java.util.Map.*;
public class pg14 {
	static HashMap<String,String> m1=new HashMap<>();
	public static void main(String[] args) {
		m1.put("AAA", "PPP");
		m1.put("BBB", "QQQ");
		m1.put("CCC", "RRR");
		String k="BBB";
		if(m1.containsKey(k)) {
			System.out.println(k+" exists in the hashmap.");
		}
		else System.out.println(k+" doesn't exist in the hashmap.");
		String a="PPP";
		if(m1.containsValue(a)) {
			System.out.println(a+" exists in the hashmap.");
		}
		else System.out.println(a+" doesn't exist in the hashmap.");
		System.out.println("Hashmap using iterator :: ");
		Iterator<String> i1=m1.keySet().iterator();
		while(i1.hasNext()) {
			String str=i1.next();
			System.out.println(str+"="+m1.get(str));
		}

	}

}
