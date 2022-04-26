package Exercise13_7;

public class Square extends GeometricObject implements Colorable {

  private double side;
  
  public Square(double side) {
    this.side = side;
    
  }
  
  public double getside() {
    return side;
    
  }
  
  public void setSide(double side) {
    this.side = side;
    
  }
  
  public String HowToColor() {
    return "Color all of the sides";
    
  }
  
  @Override 
  public double getArea() { 
    return side * side;
  }
  
  @Override
  public double getPerimeter() { 
    return side * 4;
  }
 
  
}
