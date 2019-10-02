/*

Demonstrate a block of code.

Call this file BlockDemo.java.
 */

public class BlockDemo {

  public static void main(String[] args) {
    double i, j, d;

    i = 20;
    j = 10;

    // the target of this if is a block.
    if (i != 0) {  // <--- start of a block.
      System.out.println(" i does not equal zero");  // the target of the if is the entire block.
      d = j / i;
      System.out.println("j / i is " + d);
    } // <--- End of block.
  }

}
