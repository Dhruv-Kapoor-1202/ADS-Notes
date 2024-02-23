- KMP Algorithm
- Z-value
- Manacher Algorithm - Longest Palindromic Substring

# KMP Algo

Pattern searching algorithm

- First step - we build the lps[] 
  - longest prefix that is also a proper suffex

Using Substring And Startswith
```java

void search(String s, String p) {
  int len1 = s.length();
  int len2 = p.length();
  for (int i = 0; i < len1; i++) {
    if ((S.substring(i, len1).startsWith(p))) {
      System.out.print(i + " ");
    }
  }
}

```

Using IndexOf
```java
static void isSubstring(String s1, String s2) {
  int len1 = s1.length();
  int len2 = s2.length(); 
  int index = 0;
  boolean found = false;
  while (index <= len1 - len2) {
    
  }
}
```

# ACTUAL KMP

## Calculating LPS ARRAY for the pattern
- int lps[] - longest prefic which is also proper suffix 
  - lps array is of the pattern not the string. 
- first element of lps is alwaus 0;
- j will start from 0
- 1 will start from 1
- `if (compare i == j), put j + 1 in lps, increment i and j by 1`
- `else (compare i != j); move j to element(in lps array) of previous character`
  - `if (compare j == 0 && i != j), put 0, increament i by 1;`


```
example
P   = ABCDABEABB

LPS = 0000120120
```

## PAttern Search

- i will start 0;
- j will start 0;
- loop till string len - 1;
- if (i == j), i++ and j++;
- if (j == pat.length), print i - j;
- if (i != j), move j tp element of previous character,
- if (j == 0 && i != j) increament i by 1; 


```
S   = ABABCABCABABABD
P   = ABABD
LPS = 00120

output =
```