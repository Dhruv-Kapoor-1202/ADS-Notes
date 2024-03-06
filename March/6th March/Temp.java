
public class Temp {
  public static void main(String[] args) {
    int a = 7;
    int b = 4;

    System.out.print(constructString(a, b));
  }

  public static String constructString(int a, int b) {
    String output = "";

    int temp = b + 1;

    while (temp-- > 0) {
      int alpha = a / (b + 1);
      while (alpha-- > 0) {
        output += "A ";
        a--;
      }
      if (b > 0) {
        output += "B ";
        b--;
      }
    }

    return output;
  }
}
