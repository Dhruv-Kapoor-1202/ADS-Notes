import java.util.HashMap;

public class FA {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 1, 2, 3, 4, 5, 3, 1 };

    int n = arr.length;
    // freqArray(arr, n);

    optimisedFreqArr(arr, n);
  }

  public static void optimisedFreqArr(int[] arr, int n) {
    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < n; i++) {
      hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
    }

    System.out.println(hm);
  }

  // public static void freqArray(int[] arr, int n) {
  // boolean[] visited = new boolean[n];

  // int count;
  // for (int i = 0; i < n; i++) {
  // count = 1;
  // if (visited[i] == true) {
  // continue;
  // }
  // for (int j = i + 1; j < n; j++) {
  // if (arr[i] == arr[j]) {
  // visited[j] = true;
  // count++;
  // }
  // }
  // System.out.print(arr[i] + " : " + count);
  // System.out.println();
  // }
  // }
}
