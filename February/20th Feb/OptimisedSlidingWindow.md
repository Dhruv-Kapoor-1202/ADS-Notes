# Sliding Window

## Optimised Solution (Time Complexity : O(n))

```
int arr[] = {1, 2, 1, 3, 4, 2, 3};
int w = 4;

1 2 1 3

1 : 2
2 : 1
3 : 1
```

```java
public static void main(String[] args) {
  int arr[] = {1, 2, 1, 3, 4, 2, 3};
  int w = 4;
  int n = arr.length;
  countDistinct(arr, w, n);
}
```

```java
public static void countDistinct(int[] arr, int w, int n) {
  HashMap<Integer, Integer> hm = new HashMap<>();

  for (int i = 0; i < w; i++) {
    hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1); //getOrDefault doesnt use a loop in the background
  }
  System.out.println(hm.size());

  for (int i = w; i < n; i++) {
    if (hm.get(arr[i - w]) == 1) {
      hm.remove(arr[i - w]);
    } else {
      hm.put(arr[i - w], hm.get(arr[i - w]) - 1);
    }
    hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
    System.out.println(hm.size());
  }
}
```


## First Negative integer from every window of size w

```
int[] arr = {-8, 2, 3, -6, 1, -7, 3};
int w = 3;

-8  2  3  -> -8
 2  3 -6  -> -6
 3 -6  1  -> -6
-6  1 -7  -> -6
 1 -7  3  -> -7
```

```java
public static void main(String[] args) {
  int[] arr = { -8, 2, 3, -6, 1, -7, 3 };
  int w = 3;
  int n = arr.length;
  firstNegativeInt(arr, w, n);
  System.out.println();
  firstNegOptimised(arr, w, n);
}
```

```java
public static void firstNegativeInt(int[] arr, int w, int n) { // O((n - w + 1) * w)
  boolean flag;
  for (int i = 0; i < (n - w + 1); i++) {
    flag = false;
    for (int j = 0; j < w; j++) {
      if (arr[i + j] < 0) {
        flag = true;
        System.out.println(arr[i + j]);
        break;
      }
    }
    if (!flag) {
      System.out.println("No Negative in this window");
    }
  }
}
```

```java
public static void firstNegOptimised(int[] arr, int w, int n) {
  int NI = 0;
  int NE = 0;

  for (int i = w - 1; i < n; i++) {
    while ((NI < 1) && (NI <= i - w || arr[NI] >= 0)) {
      NI++;
    }

    if (arr[NI] < 0) {
      NE = arr[NI];
    } else {
      NE = 0; // When there is no negative index in the window
    }

    System.out.println(NE);
  }
}

```

# Types of Sliding Window

1. Fixed Sized Window
2. Variable Sized Window

## Variable Sized Window

### Length of longest substring without repeating characters

```
String s = "A B C D A B C G H I A B D"
```

```java
substr(string str) {
  int n = str.length();
  int len = 0;
  for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
      if (isDistinct(str, i, j)) {
        len = Math.max(len, j - i + 1);
      }
    }
  }
}
```

```java
isDistinct(String str, int i, int j) {
  boolean[] visited = new boolean[256];
}

```
