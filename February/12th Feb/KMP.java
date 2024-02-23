public class KMP {
  static void search(String s, String p) {
    int len1 = s.length();
    // int len2 = p.length();
    for (int i = 0; i < len1; i++) {
      if ((s.substring(i, len1).startsWith(p))) {
        System.out.print(i + " ");
      }
    }
  }

  public static void main(String[] args) {
    String s = "ABABABAAB";
    String p = "AC";

    search(s, p);
  }
}
