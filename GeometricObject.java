package Exercise13_7;

public abstract class GeometricObject {
  private String color = "Green";
  private boolean filled;
  
  protected GeometricObject() {
    
  }
  
  protected GeometricObject(String c, boolean f) {
 
    filled = f;
    color = c;

    }
  
  public String getColor() { 
    return color;
  }
  
  public void setColor(String c) { 
    color = c;
  }
  
  public void setFilled(boolean f) { 
    f = filled;
  }
  
  public boolean isFilled() { 
    return filled;
  }
  
  public abstract double getPerimeter();
  
  public abstract double getArea();
}

