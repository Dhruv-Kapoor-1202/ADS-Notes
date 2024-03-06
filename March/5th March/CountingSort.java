
public class CountingSort {
  public static void main(String[] args) {
    int[] inputArr = { 5, 3, 1, 2, 4, 1, 2 };
    int[] outputArr = countSort(inputArr);
    for (int i : outputArr) {
      System.out.print(i + " ");
    }
  }

  public static int[] countSort(int[] inputArr) {
    int n = inputArr.length;
    int max = 0;
    for (int i : inputArr) {
      max = Math.max(i, max);
    }

    int[] countArr = new int[max + 1];

    for (int i = 0; i < n; i++) {
      countArr[inputArr[i]]++;
    }

    // Prefix Array
    for (int i = 1; i < countArr.length; i++) {
      countArr[i] += countArr[i - 1];
    }

    int[] outputArr = new int[n];

    for (int i = n - 1; i >= 0; i--) {
      outputArr[countArr[inputArr[i]] - 1] = inputArr[i];
      countArr[inputArr[i]]--;
    }

    return outputArr;
  }
}
