import java.util.Scanner;
import java.text.DecimalFormat;
class Population{
	private float p,r;
	Population(int a,float b){
		p=a;
		r=b;
	}
	void print(){
		DecimalFormat d=new DecimalFormat("00");
		System.out.println("\n\n---------------------------------------------------------");
		System.out.println("Initial population at th end of 2000 :: "+d.format(p));
		for(int cnt=1;cnt<=7;cnt++){
			p=p*(1+(r/100));
			System.out.println("Population at the end of "+(2000+cnt)+" is :: "+d.format(p));
		}
		System.out.println("---------------------------------------------------------");
	}

}
class pg5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter initial population :: ");
		int p=sc.nextInt();
		System.out.print("Enter growth rate (%) :: ");
		float r=sc.nextFloat();
		Population x=new Population(p,r);
		x.print();
	}
}