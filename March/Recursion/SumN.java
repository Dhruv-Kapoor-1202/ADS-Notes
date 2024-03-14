package March.Recursion;

public class SumN {
  public static void main(String[] args) {
    int sum = sum(10);
    System.out.println();
    System.out.println(sum);
  }

  public static int sum(int num) {
    if (num == 0)
      return 0;

    System.out.print(num + " ");
    return (num + sum(num - 1));
  }
}

/** 10 + (9 + (8 + (7 + (6 + (5 + (4 + (3 + (2 + (1 + (0)))))))))) */
