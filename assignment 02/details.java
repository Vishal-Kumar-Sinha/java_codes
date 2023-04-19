import java.util.Scanner;
class Details{
 private String first,last,num;
 void setDetails(String last,String first,String num){
  this.first=first;
  this.last=last;
  this.num=num;
 }
 String getNum(){
  return num;
 }
 String getFirst(){
  return first;
 }
 String getLast(){
  return last;
 }
 public String toString(){
  return "Name : "+getLast()+"  "+getFirst()+"\nPhone number : "+getNum();
 }
}

class Phonenumber{
 public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter first name :: ");
  String first=sc.next();
  System.out.print("Enter last name :: ");
  String last=sc.next();
  System.out.print("Enter phone number :: ");
  String num=sc.next();
  Details d=new Details();
  d.setDetails(last,first,num);
  System.out.println(d);
 }
}