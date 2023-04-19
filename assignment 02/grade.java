import java.util.Scanner;
class Grade {
	private String name,testnum,num;
	private double marks;
	void setDetails(String name,String testnum,double marks){
		this.name=name;
		this.testnum=testnum;
		this.num=num;
	}
	String getNum(){
		return num;
	}
	String getname(){
		return first;
	}
	String getLast(){
		return last;
	}
 public String toString(){
  return "Name : "+getLast()+"  "+getFirst()+"\nPhone number : "+getNum();
 }
}