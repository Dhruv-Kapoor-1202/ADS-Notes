package March.Recursion;

import java.util.*;

public class Fib {
  public static void main(String[] args) {
    fib(10);
  }

  public static void fib(int n) {
    // if (n < 2)
    // return n;
    // return fib(n - 1) + fib(n - 2);

    int[] dp = new int[n + 1];
    Arrays.fill(dp, -1);

    dp[0] = 0;
    dp[1] = 1;

    System.out.println(fib_memo(n, dp));
  }

  public static int fib_memo(int n, int[] dp) {
    if (dp[n] != -1)
      return dp[n];

    dp[n] = fib_memo(n - 1, dp) + fib_memo(n - 2, dp);
    System.out.print(dp[n] + " ");

    return dp[n];
  }
}
