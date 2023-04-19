import java.util.Scanner;
class Calculate{
	private int num,f,rev;
	Calculate(int n){
		num=n;
		f=0;
		rev=0;
	}
	int prime(){
		if(num==0 || num==1) return 0;
		for(int i=2;i<num;i++){
			if(num%i==0) return 0;
		}
		return 1;
	}
	int reverse(){
		int a=num;
		while(a!=0){
			f=a%10;
			rev=rev*10+f;
			a=a/10;
		}
		return rev;
	}
	void display(Calculate c){
		c.reverse();
		c.prime();
		if(c.prime()==1 && num==rev) System.out.println(num+" is prime-palindrome.");
		else System.out.println(num+" is not prime-palindrome.");
	}
}
class pg4{
	public static void main(String[]args){
		System.out.print("Enter a number :: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Calculate c1=new Calculate(num);
		c1.display(c1);
		
	}
}