import java.util.Scanner;
class Voweltostar{
	String str;
	void Inputdata() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter string :: ");
		str=s.nextLine();
		str=str.toUpperCase();
	}
	void display() {
		System.out.println("Original string :: "+str);
		str=str.replaceAll("[AEIOU]","*");
		System.out.println("Modified string :: "+str);
	}
}
public class pg1 {
	public static void main(String[] args) {
		Voweltostar n=new Voweltostar();
		n.Inputdata();
		n.display();
	}
}