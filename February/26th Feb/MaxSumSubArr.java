
public class MaxSumSubArr {
  public static void main(String[] args) {
    int[] arr = { 1, 3, -1, -2, 5 };
    int maxSum = kadane(arr);
    System.out.println("Max Sum = " + maxSum);
  }

  public static int kadane(int[] arr) {
    int n = arr.length;
    int sum = 0;

    int maxSum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
      if (sum < 0)
        sum = 0;
      maxSum = Math.max(maxSum, sum);
    }

    return maxSum;
  }
}
