import java.util.Scanner;
class Employee{
 private String first,last;
 private double salary;
 void setDetails(String last,String first,double salary){
  this.first=first;
  this.last=last;
  this.salary=salary;
 }
 double getsalary(){
  return 12*salary;
 }
 double getBonus(){
  if((12*salary)<=1000)
   return 0;
  else
   return 0.1*12*salary;
 }
 String getFirst(){
  return first;
 }
 String getLast(){
  return last;
 }
 public String toString(){
  return "Name : "+getLast()+"  "+getFirst()+"\nAnnual salary : "+getsalary()+"\nBonus : "+getBonus();
 }
}
class demoEmp{
 public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter first name :: ");
  String first=sc.next();
  System.out.print("Enter last name :: ");
  String last=sc.next();
  System.out.print("Enter monthly salary :: ");
  double salary=sc.nextDouble();
  Employee d=new Employee();
  d.setDetails(last,first,salary);
  System.out.println(d);
 }
}