
public class CheckPrime {
  public static void main(String[] args) {
    System.out.println("Prime Numbers till 100 = " + countPrime(100));
  }

  public static boolean isPrime(int num) {
    if (num <= 1)
      return false;

    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int countPrime(int num) {
    int count = 0;
    for (int i = 0; i <= num; i++) { // num / i and Not i * i as i * i could exceed integer limit
      if (isPrime(i))
        count++;
    }
    return count;
  }
}
