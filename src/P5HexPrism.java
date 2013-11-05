/** P5HexPrism inherits data from P5RegularHex, while setting new dimensions 
 * and calculating the surface area and volume of a hexagonal prism.
 */

public class P5HexPrism extends P5RegularHex {
  
  /** No argument constructor, initialize height to one */
  public P5HexPrism() {
    height = 1;
  }
  
  /** Overloaded constructor, initialize height to parameter */
  public P5HexPrism(double s, double h) {
    side = s;
    height = h;
  }
  
  /** Override, return String with formatted dimensions of a hexagonal prism */
  public String toString() {
    return (super.toString() + " x " + height );
  }
  
  /** Override and assign dimensions of a hexagonal prism */
  public void setDim (double side, double height) {
    this.side = side;
    this.height = height;
  }
  
  /** Override and calculate surface area of hexagonal prism */
  public double area() {
    return 3 * Math.sqrt(3) * side * side + 6 * side * height ; 
  }
  
  /** Override and calculate volume of hexagonal prism */
  public double volume() {
    return height * 3 * Math.sqrt(3) / 2 * side * side;
  }

}
