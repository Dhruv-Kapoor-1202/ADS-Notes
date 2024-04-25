package April.GCD;

public class GCD {
  public static void main(String[] args) {
    int num1 = 24;
    int num2 = 21;

    System.out.println("GCD or HCF of " + num1 + " and " + num2 + " : " + hcf(num1, num2));
  }

  /**
   * hcf(bigger number, smaller number)
   * hcf(24, 16)
   * hcf(8, 16)
   * hcf(8, 8)
   * hcf(0, 8)
   * hcf(8, 0)
   */
  public static int hcf(int num1, int num2) {
    if (num2 == 0)
      return num1;

    int bigger = Math.max(num1, num2);
    int smaller = Math.min(num1, num2);

    return hcf(smaller, bigger % smaller);
  }
}
