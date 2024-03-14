package March.Recursion;

public class Pow {
  public static void main(String[] args) {

    System.out.println(power(3, 3));
  }

  public static int power(int n, int p) {
    if (p == 1)
      return n;

    int k = power(n, p / 2);
    if (n % 2 == 0) {
      return k * k;
    } else {
      return n * k * k;
    }

  }
}
