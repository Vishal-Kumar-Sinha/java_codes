import java.util.Scanner;
class Reversewords {
	String str,rts;
	Reversewords(){
		str="";
		rts="";
	}
	void input() {
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter a sentence :: ");
	    str=s.nextLine();
	}
	void display() {
		String[]w=str.split(" ");
		for(int i=w.length-1;i>=0;i--)
			rts+=w[i]+" ";
		System.out.println("Before reversing, the sentence is :: "+str);
		System.out.println("After reversing, the sentence is  :: "+rts);
	}
}
public class pg4 {
	public static void main(String[] args) {
		Reversewords m=new Reversewords();
		m.input();
		m.display();
	}
}