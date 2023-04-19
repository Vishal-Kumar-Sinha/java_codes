import java.util.Scanner;
class Employee{
		private String name;
		private int income;
		Employee(String name,int income){
				this.name=name;
				this.income=income;
		}
		void Tax(){
				System.out.println("----------------------------------------");
				System.out.println("Name :: "+name+"\nAnnual income :: Rs. "+income);
				if(income<=250000)
					System.out.println("***NO TAX***");
				else if(income>250000 && income <=500000){
					int tax=(income-250000)*1/10;
					System.out.println("Payable tax :: Rs. "+tax);
				}
				else if(income>500000 && income <=1000000){
					int tax=30000+((income-500000)*2/10);
					System.out.println("Payable tax :: Rs. "+tax);
				}
				else if(income>1000000){
					int tax=50000+((income-100000)*3/10);
					System.out.println("Payable tax :: Rs. "+tax);
				}
				System.out.println("----------------------------------------");
		}
}
class pg2{
		public static void main(String[]args){
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter name :: ");
				String name=sc.nextLine();
				System.out.print("Enter annual income :: Rs. ");
				int income=sc.nextInt();
				Employee a=new Employee(name,income);
				a.Tax();
		}
}