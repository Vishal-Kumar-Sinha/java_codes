import java.util.Scanner;
class Triplet{
 private int a,b,c;
 void getData(){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter first number :: ");
  a=sc.nextInt();
  System.out.print("Enter second number :: ");
  b=sc.nextInt();
  System.out.print("Enter third number :: ");
  c=sc.nextInt();
 }
 void findprint(){
  if(a>b && a>c && b*b + c*c==a*a)
   System.out.print(a+", "+b+" & "+c+" are Pythagorean Triplets.");
  else if(b>a && b>c && a*a + c*c==b*b)
   System.out.print(a+", "+b+" & "+c+" are Pythagorean Triplets.");
  else if(c>a && c>b && a*a + b*b==c*c)
   System.out.print(a+", "+b+" & "+c+" are Pythagorean Triplets.");
  else
   System.out.print(a+", "+b+" & "+c+" are not Pythagorean Triplets.");
 }
}
class p3{
 public static void main(String[]args){
  Triplet p=new Triplet();
  p.getData();
  p.findprint();
 }
}