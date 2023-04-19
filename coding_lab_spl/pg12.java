import java.util.*;
public class pg12 {
	public static int Findit(int a,ArrayList<Integer>al) {
		int flag=-1;
		for(int i=al.size()-1;i>=0;i--) {
			int x=al.get(i);
			if(a==x) {
				flag=i;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Choose arraylist size :: ");
		int m=s.nextInt();
		System.out.println("Choose a stick (1/2) :: ");
		int stick=s.nextInt();
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println("Enter arraylist :: ");
		for(int i=0;i<m;i++) {
			int val=s.nextInt();
			al.add(val);
		}
		if(stick==1) {
			System.out.println("Enter the 2 array elements ::");
			for(int i=0;i<2;i++) {
				int k=s.nextInt();
				arr[i]=k;
			}
			al.add(arr[0],arr[1]);
			System.out.println("The updated arraylist is :: "+al);
			
		}
		else if(stick==2) {
			System.out.println("Enter the array element ::");
			arr[0]=s.nextInt();
			System.out.println("Element status :: "+Findit(arr[0],al));	
		}
		else {
			System.out.println("Invalid Stick...!");
			System.exit(0);
		}
	}

}
