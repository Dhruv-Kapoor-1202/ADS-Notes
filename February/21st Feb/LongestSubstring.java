import java.util.Arrays;

public class LongestSubstring {
  public static void main(String[] args) {
    String str = "ABCDABCGHIABD";
    System.out.println("Longest Substring Length: " + substr(str));
  }

  public static int substr(String str) {
    int n = str.length();
    int len = 0;
    int[] arr = new int[256];
    int i = 0;

    Arrays.fill(arr, -1);
    // for (int k = 0; k < 256; k++) {
    // System.out.print(arr[k] + " ");
    // }
    // System.out.println();

    for (int j = 0; j < n; j++) {
      i = Math.max(i, arr[str.charAt(j)] + 1);
      len = Math.max(len, j - i + 1);
      // System.out.println("i: " + i + ", j: " + j + ", len: " + len);

      arr[str.charAt(j)] = j; // Visited Array. I do not know anymore
    }

    // for (int k = 0; k < 256; k++) {
    // System.out.print(arr[k] + " ");
    // }
    // System.out.println();

    return len;
  }
}
