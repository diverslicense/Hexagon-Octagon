/** P5OctagonalPrism inherits data from P5RegularOctagon, while setting new 
 * dimensions and calculating the surface area and volume of an octagonal prism
 */

public class P5OctagonalPrism extends P5RegularOctagon {
  
  /** No argument constructor, initialize height to one */
  public P5OctagonalPrism() {
    height = 1;
  }
  
  /** Overloaded constructor, initialize height to parameter */
  public P5OctagonalPrism(double s, double h) {
    side = s;
    height = h;
  }
  
  /** Override, return String with formatted dimensions of an octagonal prism */
  public String toString() {
    return (super.toString() + " x " + height );
  }
  
  /** Override and assign dimensions of an octagonal prism */
  public void setDim (double side, double height) {
    this.side = side;
    this.height = height;
  }
  
  /** Override and calculate surface area of octagonal prism */
  public double area() {
    return 2 * 2 * ( 1 + Math.sqrt(2) ) * side * side + 8 * side * height; 
  }
  
  /** Override and calculate volume of octagonal prism */
  public double volume() {
    return height * 2 * ( 1 + Math.sqrt(2) ) * side * side;
  }

}
