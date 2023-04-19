import java.util.Scanner;
class Happy {
	static int SumOfDigit(int n) {
		int sum=0,digit;
		while(n>0) {
			digit=n%10;
			sum=sum+digit*digit;
			n=n/10;
		}
		return(sum);
	}
	void find(String str) {
		String pos="";
		int n;
		str=str.toUpperCase();
		for(int a=0;a<str.length();a++) {
			n=((int)str.charAt(a))-64;
			pos=pos+Integer.toString(n);
		}
		n=Integer.valueOf(pos);
		int sum=Happy.SumOfDigit(n); 
		while(sum>9) {
			sum=Happy.SumOfDigit(sum);
		}
		if(sum==1)
			System.out.println(str+" is HAPPY WORD");
		else
			System.out.println(str+" is not HAPPY WORD");
	}
}
public class pg2 {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.print("Enter a word :: ");
		String st=s.next();
		Happy h=new Happy();
		h.find(st);
	}
}