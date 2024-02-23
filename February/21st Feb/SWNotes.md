
# Types of Sliding Window

1. Fixed Sized Window
2. Variable Sized Window


## Variable Window Size



### Length of longest substring without repeating characters

`Naive Approach`
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

`Optimised Approach`

```java
public static void main(String[] args) {
  String str = "A B C D A B C G H I A B D";
  System.out.println(substr(str));
}
```

```java
public static int substr(String str) {
  int n = str.length();
  int len = 0;
  int[] arr = new int[256];
  int i;

  Arrays.fill(arr, -1);

  for (int j = 0; j < n; j++) {
    i = Math.max(i, arr[str.charAt(j)] + 1);
    len = Math.max(len, j - i + 1);

    arr[str.charAt(j)] = j; // Basically creating a Visited Array
  }
  return len;
}
```



### Longest Subarray Having Sum k

```
int[] arr = {10, 5, 2, 7, 1, 9};
int k = 15

output = 4;

```

`Brute Force`

```java
int maxlen = 0;
for (int i = 0; i < n; i++) {
  sum = 0;
  for (int j = i; j < n; j++) {
    sum += arr[j];
    if (sum == k) {
      maxlen = Math.max(maxlen, j - i + 1);
    }
  }
}
return maxlen;
```

`Optimised`

```java
longsubarr(int arr[], int n, int k) {
  HashMap<Integer, Integer> hm = new HashMap<>();  // Sum, ending index (i)

  int sum = 0;
  int maxlen = 0;

  for (int i =0; i < n; i++) {
    sum += arr[i];
    if (sum == k) {
      maxlen = i + 1;
    }

    if (!hm.containsKey(sum)) {
      hm.put(sum, i);
    }
    
    if (hm.containsKey(sum - k)) {
      if (maxlen < (i - hm.get(sum - k))) {
        maxlen = i - hm.get(sum - k);
      }
    }
  }

}

```