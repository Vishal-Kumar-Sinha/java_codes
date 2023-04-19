import java.util.Scanner;
class Sort{
 private int arr[]=new int[10];
 Sort(int []arr){
  this.arr=arr;
 }
 void arrange(){
  int min=-1;
  for(int i=0;i<arr.length;i++){
   min=i;
   for(int j=i+1;j<arr.length;j++){
    if(arr[min]>arr[j])
     min=j;
    int temp=arr[min];
    arr[min]=arr[j];
    arr[j]=temp;
   }	
  }
  System.out.println("Sorted Array is:: ");
  for(int i=0;i<arr.length;i++)
   System.out.print(arr[i]+"  ");
 }
 void search(int num){
  int lb=0;
  int ub=arr.length-1;
  int mid=-1;
  int f=0;
  while(lb<=ub){
   mid=(lb+ub)/2;
   if(arr[mid]==num){
    f=1;
    break;
   }
   else if(arr[mid]>num)
    ub=mid-1;
   else
    lb=mid+1;
  }
  if(f==1)
   System.out.println("Search Successful at "+(mid+1));
  else
   System.out.println("Search Unsuccessful!!");
 }
}
class p2{
 public static void main(String args[]){
  int a[]=new int[10];
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter 10 Array Elements :: ");
  for(int i=0;i<10;i++)
   a[i]=sc.nextInt();
  Sort ob=new Sort(a);
  ob.arrange();
  System.out.print("\nEnter Number to be searched :: ");
  int n=sc.nextInt();
  ob.search(n);
 }
}