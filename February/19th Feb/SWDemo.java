import java.util.*;

public class SWDemo {
  public static void main(String[] args) {
    // int[] arr = { 1, 2, 1, 3, 4, 2, 3 };
    int[] arr = { 1, 1, 1, 1, 1, 1, 1 };
    int w = 4;
    subarray(arr, arr.length, w);
  }

  public static void subarray(int[] arr, int n, int w) {
    for (int i = 0; i < n - w + 1; i++) {
      System.out.println(count(Arrays.copyOfRange(arr, i, i + w), w));
    }
  }

  public static int count(int arr[], int w) {
    int distinctCount = 0;
    for (int i = 0; i < w; i++) {
      int j;
      for (j = 0; j < i; j++) {
        if (arr[i] == arr[j]) {
          break;
        }
      }
      if (i == j)
        distinctCount++;
    }
    return distinctCount;
  }
}
