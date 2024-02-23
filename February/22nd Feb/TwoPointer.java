
public abstract class TwoPointer {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50 };
    int k = 30;
    int n = arr.length;
    System.out.println(optimisedApproach(arr, k, n));
  }

  public static boolean optimisedApproach(int[] arr, int k, int n) {
    int i = 0;
    int j = n - 1;
    int sum = 0;

    while (i < j) {
      sum = arr[i] + arr[j];
      if (sum == k) {
        return true;
      } else if (sum < k) {
        i++;
      } else {
        j--;
      }
    }
    return false;
  }
}
