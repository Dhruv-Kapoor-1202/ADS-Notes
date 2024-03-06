
public class Pigeon {
  public static void main(String[] args) {
    int[] inputArr = { 8, 2, 2, 7, 1, 6, 8 };
    int n = inputArr.length;

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i : inputArr) {
      max = Math.max(i, max);
      min = Math.min(i, min);
    }
    int range = max - min + 1;
    int[] pHoleArr = new int[range];

    for (int i = 0; i < n; i++) {
      pHoleArr[inputArr[i] - min]++;
    }

    int index = 0;
    for (int i = 0; i < range; i++) {
      while (pHoleArr[i] > 0) {
        inputArr[index++] = i + min;
        pHoleArr[i]--;
      }
    }
    for (int i : inputArr)
      System.out.print(i + " ");
  }
}
