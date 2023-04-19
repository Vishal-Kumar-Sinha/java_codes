import java.util.Scanner;
class Calculate{
 private double x,y,s,d;
 void inputData(){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter first number :: ");
  x=sc.nextDouble();
  System.out.print("Enter second number :: ");
  y=sc.nextDouble();
 }
 void calculate(){
  s=x+y;
  d=x-y;
 }
 void outputdata(){
  System.out.println("Sum of "+x+" and "+y+" is :: "+s+"\nDifference of "+x+" and "+y+" is :: "+d);
 }
}
class p1{
 public static void main(String[]args){
  Calculate p=new Calculate();
  p.inputData();
  p.calculate();
  p.outputdata();
 }
}