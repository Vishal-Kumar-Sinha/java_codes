import java.util.Scanner;
class Unique {
	void find(String str) {
		str=str.toUpperCase();
        boolean isUnique=true;
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            for(int j=i+1;j<str.length();j++) {
                if(ch==str.charAt(j)) {
                    isUnique=false;
                    break;
                }
            }
            if(!isUnique)
            break;
        }
        if(isUnique) 
            System.out.println(str+" is Unique String");
        else
            System.out.println(str+" not Unique String");
	}
}
public class pg1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a string :: ");
	    String str=s.nextLine();
	    Unique a=new Unique();
	    a.find(str);
	}
}