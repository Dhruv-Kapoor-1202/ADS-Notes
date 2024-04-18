package April.DP;

import java.util.Scanner;

public class Step {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter Number of Steps: ");
    int numOfSteps = obj.nextInt();
    obj.close();

    totalWays(numOfSteps);
  }

  public static void totalWays(int numOfSteps) {
    int a = 1;
    int b = 1;

    for (int i = 2; i <= numOfSteps; i++) {
      int temp = a + b;
      a = b;
      b = temp;
    }
    System.out.println("Num of Ways : " + b);
  }
}
