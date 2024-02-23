import java.util.HashMap;

public class OSW {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 1, 3, 4, 2, 3 };
    int w = 4;
    int n = arr.length;
    countDistinct(arr, w, n);
  }

  public static void countDistinct(int[] arr, int w, int n) { // O(N)
    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < w; i++) {
      hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1); // getOrDefault doesnt use a loop in the background
    }
    System.out.println(hm.size());

    for (int i = w; i < n; i++) {
      if (hm.get(arr[i - w]) == 1) {
        hm.remove(arr[i - w]);
      } else {
        hm.put(arr[i - w], hm.get(arr[i - w]) - 1);
      }
      hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
      System.out.println(hm.size());
    }
  }
}
