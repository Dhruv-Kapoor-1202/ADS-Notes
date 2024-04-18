package April.DP;

import java.util.Scanner;

/**
 * houses = {5, 6, 9, 11};
 * maxProfit = 6 + 11 = 17;
 * 
 * maximize the thief's profit. but the
 * thief should only steal from NON -
 * CONSECUTIVE houses
 */
public class MaxLoot {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter number of houses : ");
    int size = obj.nextInt();

    int[] houses = new int[size];
    System.out.print("Enter the Money in each house : ");
    for (int i = 0; i < size; i++) {
      houses[i] = obj.nextInt();
    }

    int maxPrice = maxLootPrice(houses, size);

    System.out.println("Max Loot Price : " + maxPrice);
  }

  public static int maxLootPrice(int[] houses, int size) {
    if (size == 1)
      return houses[0];
    if (size == 2)
      return Math.max(houses[0], houses[1]);

    int index = 0;
    int maxPrice = 0;

    // while (index < size) {
    // // Looting

    // // Not Looting
    // }

    return size;

  }
}
