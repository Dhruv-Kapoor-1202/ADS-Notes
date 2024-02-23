
public class LRIndices {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
    // int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1 };
    int[][] arr1 = { { 1, 2 }, { 1, 7 }, { 2, 6 }, { 4, 5 } };

    printSum(arr, arr1);
  }

  public static void printSum(int[] arr, int[][] arr1) {
    // First We calculate the Prefix sum array
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      arr[i] += arr[i - 1];
    }

    int m = arr1.length;
    int sum;
    for (int i = 0; i < m; i++) {
      if (arr1[i][0] == 1) {
        System.out.print(arr[arr1[i][1] - 1] + " ");
        continue;
      }
      sum = arr[arr1[i][1] - 1] - arr[arr1[i][0] - 2];
      System.out.print(sum + " ");
    }
  }

  // public static void printSum(int[] arr, int[][] arr1) {
  // int m = arr1.length;

  // int sum;
  // for (int i = 0; i < m; i++) {
  // sum = 0;
  // for (int j = arr1[i][0]; j <= arr1[i][1]; j++) {
  // sum += arr[j - 1];
  // }
  // System.out.print(sum + " ");
  // }
  // }
}
