
public class PrefixArr {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 };

    // int[] newArr = preArr(arr);
    optimisedPreSum(arr);

    for (int ele : arr) {
      System.out.print(ele + " ");
    }
  }

  public static void optimisedPreSum(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      arr[i] += arr[i - 1];
    }
  }

  // public static int[] preArr(int[] arr) {
  // int n = arr.length;

  // int[] output = new int[n];
  // int sum;
  // for (int i = 0; i < n; i++) {
  // sum = 0;
  // for (int j = 0; j <= i; j++) {
  // sum += arr[j];
  // }
  // output[i] = sum;
  // }
  // return output;
  // }
}
