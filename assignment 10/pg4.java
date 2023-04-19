import java.util.Scanner;
class Charrepeat {
	void find(String str) {
		String word="";
        int count=0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==' ') {
                for(int j=0;j<word.length()-1;j++) {
                    if(word.charAt(j)+1==word.charAt(j+1)) {
                        count++;
                        System.out.println(word);
                        break;
                    }
                }
                word = "";
            }
            else
                word+=str.charAt(i);
        }
        System.out.println("Number of words containing consecutive letters :: "+count);
	}
}
public class pg4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a string :: ");
	    String st=s.nextLine();
	    st=st.toUpperCase();
        st+=" ";
	    Charrepeat a=new Charrepeat();
	    a.find(st);
	}
}