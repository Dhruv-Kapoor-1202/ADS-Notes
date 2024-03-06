
/**
 * write a program in java to print
 * a string. You are given two integers
 * `a` and `b` such that `a` is always
 * greator than `b`, print the string
 * in such a way such that the two
 * occur together for the minimum times.
 * 
 * the string should always start with
 * `A`
 * 
 * 
 * ip -> A A A A A B B A A B B
 * a = 7, b = 4
 * 
 * op -> A B A B A A B A A B A
 * or
 * op -> A B A B A B A A B A A
 */
public class AB {
  public static void main(String[] args) {
    int a = 7;
    int b = 4;

    System.out.println(constructString(a, b));
  }

  public static String constructString(int a, int b) {
    int temp = b + 1;
    String output = "";

    while (temp > 0) {
      int alpha = a / (b + 1);
      while (alpha > 0) {
        output += "A ";
        a--;
        alpha--;
      }
      if (b > 0) {
        output += "B ";
        b--;
      }
      temp--;
    }

    return output;
  }
}
