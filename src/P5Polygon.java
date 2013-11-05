
public abstract class P5Polygon {
  protected double side;
  protected double height;
  
  /** Construct no argument constructor, initialize side to 1 */
  public P5Polygon() {
    side = 1;
  }
  
  /** No arg constructor, initialize side to parameter */
  public P5Polygon (double s) {
    side = s;
  }
  
  /** Return side */
  public double getSide() {
    return side;
  }
  
  /** Format and return class name and side */
  public String toString() {
    return (getName() + " \t" + side);
  }
  
  /** Generates name of this class object and return as a String */
  public String getName() {
    return ( this.getClass().getName() + ": ");
  }
  
  /** Set a new side for 2-D polygon */
  public void setDim (double side) {
    this.side = side;
  }
  
  /** Set a new side and new height for 3-D polygon */
  public void setDim (double side, double height) {
    this.side = side;
    this.height = height;
  }
  
  /** Calculate perimeter of a polygon */
  public double perimeter() {
    return 1; 
  }
  
  /** Calculate area of a polygon */
  public double area() {
    return 1; 
  }
  
  /** Calculate volume of a polygon */
  public double volume() {
    return 1;
  }

}
