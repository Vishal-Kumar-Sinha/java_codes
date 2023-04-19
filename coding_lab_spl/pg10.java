import java.util.*;
class pg10 {
	public static void toRoman(int num) {
		System.out.println("Original number :: "+num);
		int[] values= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] rletter= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		StringBuilder roman=new StringBuilder();
		for(int i=0;i<values.length;i++) {
			while(num>=values[i]) {
				num=num-values[i];
				roman.append(rletter[i]);
			}
		}
		System.out.println("Roman number :: "+roman.toString());
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number :: ");
		int n=s.nextInt();
		toRoman(n);
	}

}