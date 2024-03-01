
public class PrimeSieve {
  public static void main(String[] args) {
    getPrimes(50);
  }

  public static boolean[] createPrimeTable(int n) {
    boolean[] arr = new boolean[n + 1];

    for (int i = 2; i * i <= n; i++) { // or i <= n / i
      if (!arr[i]) {
        for (int j = i * i; j <= n; j += i) {
          arr[j] = true;
        }
      }
    }
    return arr;
  }

  public static void getPrimes(int n) {
    boolean[] arr = createPrimeTable(n);
    for (int i = 2; i <= n; i++) {
      if (!arr[i])
        System.out.print(i + " ");
    }
  }
}
