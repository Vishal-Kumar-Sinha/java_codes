import java.util.Scanner;
class Maxvowel {
	String str,wrd="",mwrd="";
	int count=0,maxcount=0;
	void input() {
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter a sentence :: ");
	    str=s.nextLine();
	    str+=" ";
	}
	void display() {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				count++;
			if(ch==' ') {
				if(count>maxcount) {
					maxcount=count;
					mwrd=wrd;
				}
				wrd="";
				count=0;
			}
			else wrd+=ch;
		}
		System.out.println("Word with maximum vowel is :: "+mwrd+"\nMaximum number of vowel is :: "+maxcount);
	}
}
public class pg5 {
	public static void main(String[] args) {
		Maxvowel m=new Maxvowel();
		m.input();
		m.display();
	}
}