import java.util.*;

/**
 * QUESTION
 * 
 * Write a program in java to find
 * non-empty subsets of an array
 * having `n` number of integers
 * such that the sum of the subset
 * should be divisible by `n`.
 * 
 * subset = 2^n
 * if we include empty set
 */
public class Pigeon {
  public static void main(String[] args) {
    int[] inputArr = { 2, 3, 7, 1, 9, 12, 4, 9 };
    int n = inputArr.length;

    HashMap<Integer, Integer> hm = new HashMap<>();

    int sum = 0;
    for (int i = 0; i < n; i++) {
      // Prefix Residue
      sum = (sum + inputArr[i]) % n;

      if (sum == 0) {
        for (int j = 0; j <= i; j++) {
          System.out.print(j + " ");
        }
        System.out.println();
      }
      if (hm.containsKey(sum)) {
        for (int j = hm.get(sum) + 1; j <= i; j++) {
          System.out.print(j + " ");
        }
        // return;
        System.out.println();
      } else {

        hm.put(sum, i);
      }
    }

  }
}
