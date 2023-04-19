import java.util.Scanner;
class Squaredata{
 public static void main(String[]args){
  Square sq=new Square();
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter length :: ");
  double length=sc.nextDouble();
  sq.setLength(length);
  System.out.println(sq);
 }
}
class Circledata{
 public static void main(String[]args){
  Circle q=new Circle();
  Scanner s=new Scanner(System.in);
  System.out.print("Enter radius :: ");
  double radius=s.nextDouble();
  q.setRadius(radius);
  System.out.println(q);
 }
}