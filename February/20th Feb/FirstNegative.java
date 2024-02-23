
public class FirstNegative {
  public static void main(String[] args) {
    int[] arr = { -8, 2, 3, -6, 1, -7, 3 };
    int w = 3;
    int n = arr.length;
    firstNegativeInt(arr, w, n);
  }

  public static void firstNegativeInt(int[] arr, int w, int n) { // O((n - w + 1) * w)
    boolean flag;
    for (int i = 0; i < (n - w + 1); i++) {
      flag = false;
      for (int j = 0; j < w; j++) {
        if (arr[i + j] < 0) {
          flag = true;
          System.out.println(arr[i + j]);
          break;
        }
      }
      if (!flag) {
        System.out.println("No Negative in this window");
      }
    }

  }
}
