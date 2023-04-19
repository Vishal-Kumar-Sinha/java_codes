import java.util.Scanner;
class Grade{
	private String name;
	private int bas,expn;
	private double inc,nbas;
	Grade(){
		name="";
		bas=0;
		expn=0;
		inc=0.0d;
		nbas=0.0d;
	}
	void accept(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee name :: ");
		name=sc.nextLine();
		System.out.print("\nEnter basic salary :: Rs. ");
		bas=sc.nextInt();
		System.out.print("Enter experience :: ");
		expn=sc.nextInt();
	}
	void increment(){
		if(expn>=0 && expn<3){
			inc=1000+(0.1*bas);
			nbas=bas+inc;
		}
		else if(expn>=3 && expn<5){
			inc=3000+(0.12*bas);
			nbas=bas+inc;
		}
		else if(expn>=5 && expn<10){
			inc=5000+(0.15*bas);
			nbas=bas+inc;
		}
		else if(expn>=10){
			inc=8000+(0.2*bas);
			nbas=bas+inc;
		}
		else System.out.print("\n\n\t...INVALID INPUT...\n");
	}
	void display(){
		System.out.println("Employee name :: "+name+"\nBasic salary  :: Rs. "+bas+"\nExperience    :: "+expn+" yrs\nIncrement     :: Rs. "+inc+"\nNew salary    :: Rs. "+nbas);
	}
}
class prg2{
	public static void main(String[]args){
		Grade g=new Grade();
		g.accept();
		g.increment();
		g.display();
	}
}