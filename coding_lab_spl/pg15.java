import java.util.*;
public class pg15 {
	public static HashMap<String,String> m1=new HashMap<>();
	public static void Properties(String s1,String s2) {
		m1.put(s1, s2);
	}
	public static void main(String[] args) {
		Properties("West Bengal","Kolkata");
		Properties("Odhisha","Berhampore");
		Properties("Telengana","Hyderabad");
		System.out.println("Hashmap using iterator :: \n");
		Iterator<String> i1=m1.keySet().iterator();
		while(i1.hasNext()) {
			String str=i1.next();
			System.out.println(str+"="+m1.get(str));
		}

	}

}
