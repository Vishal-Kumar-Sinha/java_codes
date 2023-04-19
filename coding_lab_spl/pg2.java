import java.util.Scanner;
import java.util.Arrays;
public class pg2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 strings :: ");
		String str1=s.nextLine();
	    String str2=s.nextLine();
	    str1=str1.toLowerCase();
	    str2=str2.toLowerCase();
	    if(str1.length()==str2.length()) {
	    	char[] c1=str1.toCharArray();
	    	char[] c2=str2.toCharArray();
	    	Arrays.sort(c1);
	    	Arrays.sort(c2);
	    	boolean result=Arrays.equals(c1, c2);
	    	if(result) System.out.println("These are amazing anagrams.");
	    	else System.out.println("These are not anagrams.");
	    }
	    else System.out.println("These are not anagrams.");
	}
}