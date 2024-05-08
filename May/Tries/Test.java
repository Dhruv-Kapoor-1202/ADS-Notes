package May.Tries;

public class Test {

  static int start = 1;

  final int end;

  public Test(int x) {
    x = 2;
    end = x;
  }

  public void fly(int distance) {
    System.out.println(end - start);
    System.out.println(distance);
  }

  public static void main(String[] args) {
    new Test(15).fly(5);
    // new Test(20).fly(10);
  }
}