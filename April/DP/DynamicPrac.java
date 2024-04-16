package April.DP;

import java.util.*;

public class DynamicPrac {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter Number : ");
    int ip = obj.nextInt();

    System.out.print("Tabulation : ");
    fibTab(ip);
  }

  public static void fibTab(int ip) {
    if (ip <= 1 && ip >= 0) {
      System.out.println(ip);
      return;
    }
    if (ip < 0) {
      System.out.println("Enter a Valid number");
    }

    int[] dp = new int[ip + 1];

    dp[0] = 0;
    dp[1] = 1;

    for (int i = 2; i <= ip; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    System.out.println(dp[ip]);
  }

}
