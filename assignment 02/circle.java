class Circle{
 private double radius;
 void setRadius(double radius){
  this.radius=radius;
 }
 double getRadius(){
  return radius;
 }
 double getDiameter(){
  return 2*radius;
 }
 double getArea(){
  return 3.14*radius*radius;
 }
 double getPerimeter(){
  return 2*3.14*radius;
 }
 public String toString(){
  return "Radius = "+getRadius()+"\nDiameter = "+getDiameter()+"\nArea = "+getArea()+"\nPerimeter = "+getPerimeter();
 }
}