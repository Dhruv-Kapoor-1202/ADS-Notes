
public class MinMax {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    int n = arr.length;

    printMinMax(arr, n);
  }

  public static void printMinMax(int[] arr, int n) {
    int i = 0;
    int j = n - 1;

    while (i < n / 2) {
      System.out.print(arr[j] + " " + arr[i] + " ");
      j--;
      i++;
    }
    if (n % 2 != 0) {
      System.out.println(arr[n / 2]);
    }
  }
}
