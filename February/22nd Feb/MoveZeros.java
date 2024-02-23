
public class MoveZeros {
  public static void main(String[] args) {
    int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0 };
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    moveZero(arr, n);

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

  }

  public static void moveZero(int[] arr, int n) {
    int i;
    int j = 0;
    for (i = 0; i < n; i++) {
      if (arr[i] != 0 && arr[j] == 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      if (arr[j] != 0) {
        j = j + 1;
      }
    }
  }
}
