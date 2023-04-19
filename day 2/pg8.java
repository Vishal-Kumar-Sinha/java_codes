import java.util.Scanner;

class Student {
	String name,stream,college;
	int roll;
	String arr[][]=new String[7][3];
	double sum1=0.0,sum2=0.0;
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter name :: ");
		name=s.next();
		System.out.print("Enter stream :: ");
		stream=s.next();
		System.out.print("Enter college :: ");
		college=s.next();
		System.out.print("Enter roll :: ");
		roll=s.nextInt();
	}
	void marks() {
		Scanner s=new Scanner(System.in);
		for(int i=0;i<7;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=s.next();
			}
		}
		for(int i=1;i<7;i++) {
			sum1+=Double.parseDouble(arr[i][1]);
			sum2+=Double.parseDouble(arr[i][2]);
		}	
	}
	void display() {
		System.out.println("Student name :: "+name);
		System.out.println("Student roll :: "+roll);
		System.out.println("Stream 		 :: "+stream);
		System.out.println("College 	 :: "+college);
		System.out.println("Student Marksheet ::");
		for(int i=0;i<7;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Total theory marks :: "+sum1);
		System.out.println("Total internal marks :: "+sum2);
	}
}
public class pg8 {

	public static void main(String[] args) {
		Student st1=new Student();
		Student st2=new Student();
		st1.input();
		st1.marks();
		st1.display();
		st2.input();
		st2.marks();
		st2.display();
	}

}
