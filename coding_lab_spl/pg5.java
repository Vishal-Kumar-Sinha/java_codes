import java.util.*;
public class pg5 {
	public static boolean Strng(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.toLowerCase().equals(rev.toLowerCase())) return true;
		else return false;
	}
	public static void main(String[] args) {
		ArrayList <String> ll=new ArrayList<>();
		ll.add("Madam");
		ll.add("Radar");
		ll.add("ABCD");
		ll.add("efgh");
		ll.add("abba");
		ArrayList <String> withpalindrome=new ArrayList<>();
		ArrayList <String> withoutpalindrome=new ArrayList<>();
		System.out.println(ll);
		for(int i=0;i<ll.size();i++) {
			String temp=ll.get(i);
			if(Strng(temp)) withpalindrome.add(temp);
			else withoutpalindrome.add(temp);
		}
		System.out.println("Withpalindrome arraylist :: "+withpalindrome);
		System.out.println("Withoutpalindrome arraylist :: "+withoutpalindrome);

	}

}
