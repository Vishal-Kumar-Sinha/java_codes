import java.util.Scanner;
class SpecialPalindrome {
	void find(String str) {
        int l=str.length();
        if(str.charAt(0)==str.charAt(l-1)) {
            boolean isPalin=true;
            for(int i=1;i<l/2;i++) {
                if(str.charAt(i)!=str.charAt(l-1-i)) {
                    isPalin=false;
                    break;
                }
            }
            if(isPalin)
                System.out.println(str+" is Palindrome");
            else
                System.out.println(str+" is Special");
        }
        else
            System.out.println(str+" is Neither Special nor Palindrome");
	}
}
public class pg3 {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.print("Enter a word :: ");
		String st=s.next();
		st=st.toUpperCase();
		SpecialPalindrome a=new SpecialPalindrome();
		a.find(st);
	}
}