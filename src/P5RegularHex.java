/** P5RegularHex inherits data from P5Polygon, while setting new dimensions 
 * and calculating the area and perimeter of a regular hexagon.
 */

public class P5RegularHex extends P5Polygon {
  
  /** No argument constructor */
  public P5RegularHex() {
    side = 1;
  }
  
  /** Overloaded constructor, pass the side parameter to P5Polygon(s) */
  public P5RegularHex ( double side ) {
   super(side);
  }
  
  /** Override and assign dimensions of a regular hexagon */
  public void setDim (double side) {
    this.side = side;
  }
   
  /** Override and implement super class perimeter */
  public double perimeter() {
    return side * 6;
  }
  
  /** Implement superclass area and calculate area of hexagon */
  public double area() {
    return 3 * Math.sqrt(3) / 2 * side * side;
  }
  
}
