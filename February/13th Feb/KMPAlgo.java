
public class KMPAlgo {
  /**
   * 
   * @param s1
   * @param s2
   * @return void
   */
  public static void kmpSearch(String s1, String s2) {
    int len1 = s1.length(); // txt
    int len2 = s2.length(); // pattern

    int lps[] = new int[len2];

    computeLPSArray(s2, len2, lps);

    int i = 0; // index for txt[]
    int j = 0; // index for pat[]
    boolean found = false; // Flag variable, helps us do stuff if the pattern doesnt exist.

    while ((len1 - i) >= (len2 - j)) { // if pattern is bigger than string, we do not compute.
      if (s2.charAt(j) == s1.charAt(i)) {
        j++;
        i++;
      }
      if (j == len2) {
        found = true;
        System.out.println("Pattern at : " + (i - j));
        j = lps[j - 1];
      } else if (i < len1 && s2.charAt(j) != s1.charAt(i)) { // mismatch after j matches
        // Do not match lps[0...lps[j - 1]] characters, they will match anyway
        if (j != 0) {
          j = lps[j - 1];
        } else {
          i = i + 1;
        }
      }
    }
    if (!found)
      System.out.println("Pattern Not Found");
  }

  public static void computeLPSArray(String s2, int M, int lps[]) {
    int j = 0;
    int i = 1;
    lps[0] = 0; // lps[0] is always 0

    while (i < M) {
      if (s2.charAt(i) == s2.charAt(j)) {
        j++;
        lps[i] = j;
        i++;
      } else { // if (pat[i] != pat[j])
        if (j != 0) {
          j = lps[j - 1];
          // also, note that we don not increment i here
        } else { // if (j == 0)
          lps[i] = j;
          i++;
        }
      }
    }
  }

  public static void main(String[] args) {
    String s = "ABABCABCABABABDABABD";
    String p = "ABABD";

    // System.out.print("LPS ARRAY : ");
    // computeLPSArray(p, s.length(), null);
    kmpSearch(s, p);
  }
}
