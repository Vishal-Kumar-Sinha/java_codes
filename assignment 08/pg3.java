import java.util.Scanner;
class Palinstring {
	String str,word,rev;
	Palinstring(){
		str="";
		word="";
		rev="";
	}
	void Inputdata() {
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter a sentence :: ");
	    str=s.nextLine();
	    str+=" ";
	    str=str.toUpperCase();
	}
	void Checkresult()
	{ 
		char ch; 
		System.out.println("Input string :: "+str);
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch!=' ') {
				word=word+ch;
				rev=ch+rev;
			}
			else{
				if(word.equals(rev)) 
					System.out.println("Palindrome word :: "+word);	 
				word="";
				rev="";
			}
		}
	}
}
public class pg3 {
	public static void main(String[] args) {
		Palinstring p=new Palinstring();
		p.Inputdata();
		p.Checkresult();
	}
}