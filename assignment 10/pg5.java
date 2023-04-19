import java.util.Scanner;
class CitySTD {
	final int SIZE=10;
	String cities[]=new String[SIZE];
    String stdCodes[]=new String[SIZE];
	void input() {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter "+SIZE+" cities and their STD codes:");
        for(int i=0;i<SIZE;i++) {
            System.out.print("Enter City Name    :: ");
            cities[i]=s.nextLine();
            System.out.print("Enter its STD Code :: ");
            stdCodes[i]=s.nextLine();
        }
	}
	void find(String str) {
		int i;
        for(i=0;i<SIZE;i++) {
            if(str.compareToIgnoreCase(cities[i])==0)
                break;
        }
        if(i<SIZE){
            System.out.println("Search Successful");
            System.out.println("City name :: "+cities[i]);
            System.out.println("STD Code  :: "+stdCodes[i]);
        }
        else
            System.out.println("Search Unsuccessful");
	}
}
public class pg5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		CitySTD c=new CitySTD();
	    c.input();
		System.out.print("Enter city name to search :: ");
	    String st=s.next();
	    c.find(st);
	}
}