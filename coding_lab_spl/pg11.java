import java.util.*;
public class pg11 {

	public static ArrayList<Integer> Reversal(ArrayList<Integer>al) {
		for(int i=0;i<al.size()/2;i++) {
			int temp=al.get(i);
			al.set(i, al.get(al.size()-i-1));
			al.set(al.size()-i-1, temp);
		}
		return al;
	}

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter input :: ");
		String str=s.next();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' ) {
				int n=Integer.parseInt(String.valueOf(str.charAt(i+1)));
				al.add(n);
			}
			else if(str.charAt(i)=='b') {
				Collections.sort(al);
				System.out.println("Sorted arrayist is ::\n"+al);
			}
			else if(str.charAt(i)=='c') {
				System.out.println("Reversed arraylist is ::\n"+Reversal(al));
			}
			else if(str.charAt(i)=='d') {
				System.out.println("The arraylist size is :: "+al.size());
			}
			else if(str.charAt(i)=='e') {
				System.out.println("Values of arraylist is :: ");
				for(int j=0;j<al.size();j++) {
					System.out.println(al.get(j));
				}
			}
		}

	}

}