/** P5RegularOctagon inherits data from P5Polygon, while setting new dimensions 
 * and calculating the area and perimeter of a regular octagon.
 */

public class P5RegularOctagon extends P5Polygon {
  
  /** No argument constructor */
  public P5RegularOctagon() {
    side = 1;
  }
  
  /** Overloaded constructor receiving one parameter type double */
  public P5RegularOctagon ( double side ) {
    super(side);
  }
  
  /** Override and assign dimensions of a regular octagon */
  public void setDim (double side) {
    this.side = side;
  }
  
  /** Override and implement parent class perimeter */
  public double perimeter() {
    return 8 * side;
  }
  
  /** Override and implement parent class area, calculate area of octagon */
  public double area() {
    return 2 * ( 1 + Math.sqrt(2) ) * side * side;
  }
  
}