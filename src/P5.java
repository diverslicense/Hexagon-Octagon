/**

 * Assignment 5               P5.java           Due August 28, 2013
 * login #: cs11vau         
 * Chloe Kaliman-Pizzichini (PID: A08511300)
 */
import java.util.Scanner;
/**
 * class P5 This program will calculate the area and perimeter of a regular
 * hexagon and a regular octagon, surface area and volume of a regular hexagonal
 * prism and a regular octagonal prism, using an abstract class, concrete
 * classes, constructors, arrays, and an inheritance hierarchy.
 */
public class P5 {
  private static final int POLYS = 4; // 4 Polygon objects
  private static P5Polygon[] a; // Array of polygons

  /** main method runs all other classes and methods */
  public static void main(String [] args)
  {
    char choice; // Repeat program
    double side; // Input Hexagon, Octagon
    double height; // Input Prisms
    String inputStr = null; // Input string
    Scanner scan = new Scanner(System.in);
    
    a = new P5Polygon[POLYS]; // Allocate 4 Polygon ref
    a[0] = new P5RegularHex(); // Instantiate objects
    a[1] = new P5HexPrism(1.1, 2.2);
    a[2] = new P5RegularOctagon();
    a[3] = new P5OctagonalPrism(3.3, 4.4);
    prt(); // Display objects
    
    do
    {
      System.out.print("\nEnter Hexagon and Octagon (side): ");
      side = scan.nextDouble();
      System.out.print("Enter Prism height: ");
      height = scan.nextDouble();
      a[0].setDim(side); // Reassign
      a[1].setDim(side, height);
      a[2].setDim(side);
      a[3].setDim(side, height);
      prt(); // Display objects
      System.out.print("\nWant to compute polygon figures (y/n)? ");
      inputStr = scan.next(); // Read, assign to string
      choice = inputStr.charAt(0); // Assign 1st character
    } while (choice != 'n' && choice != 'N'); // Loop until n or N
  }

  /** prt method prints output using array */
  public static void prt() {
    int i;
    for (i = 0; i < POLYS; ++i)
      if (i % 2 == 0) {
        System.out.print( a[i] + " side has an area:");
        System.out.printf("\t\t%.3f \n", a[i].area());
        System.out.print(a[i] + " side has a perimeter: ");
        System.out.printf("\t%.3f \n", a[i].perimeter());
      } else {
        System.out.print(a[i].toString() + " has a surface area: ");
        System.out.printf("\t%.3f", a[i].area());
        System.out.printf(" and volume: %.3f\n", a[i].volume());
      }
  }
}
