import java.util.Scanner;
class Longword{
	String str,word,nextword;
	Longword(){
		str="";
		word="";
		nextword="";
	}
    void Inputdata() {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter a sentence :: ");
       str=s.nextLine();
       str+=" ";
    }
    void display() {
    	int len=str.length();
    	for(int i=0;i<len;i++) {
            char ch=str.charAt(i);
            if(ch==' ') {
                 if(word.length()>nextword.length())
                     nextword=word;    
                 word="";
            }
            else
                word+=ch;
        }
    	System.out.println("The longest word :: "+nextword+"\nLength of the word :: "+nextword.length());
    }    
}
public class pg2 {
	public static void main(String[] args) {
		Longword l=new Longword();
		l.Inputdata();
		l.display();
	}
}