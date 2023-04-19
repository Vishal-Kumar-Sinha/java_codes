class Square{
 private double length;
 void setLength(double length){
  this.length=length;
 }
 double getLength(){
  return length;
 }
 double getArea(){
  return length*length;
 }
 double getPerimeter(){
  return 4*length;
 }
 public String toString(){
  return "Length = "+getLength()+"\nArea = "+getArea()+"\nPerimeter = "+getPerimeter();
 }
}