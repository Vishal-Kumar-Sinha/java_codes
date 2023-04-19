import java.util.Scanner;
class array {
	int arr[]=new int[20];
	void savg() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter array size :: ");
		int n=s.nextInt();
		System.out.println("Enter array elements :: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		double sum=0.0;
		for(int i : arr)
			sum+=i;
		System.out.println("Sum of array elements :: "+sum);
		double avg=sum/n;
		System.out.println("Average of array elements :: "+avg);
	}
}
public class pg14 {
	public static void main(String[] args) {
		array a=new array();
		a.savg();

	}

}
