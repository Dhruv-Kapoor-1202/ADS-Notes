# Frequency Array

```
int[] arr = { 1, 2, 1, 2, 3, 4, 5, 3, 1 };

int n = arr.length;
freqArray(arr, n);
```

## Naive Approach

- Two loops
- boolean array
  - flag for visited elements
- TC -> O(N^2);

```java
public static void freqArray(int[] arr, int n) {
  boolean[] visited = new boolean[n];

  int count;
  for (int i = 0; i < n; i++) {
    count = 1;
    if (visited[i] == true) {
      continue;
    }
    for (int j = i + 1; j < n; j++) {
      if (arr[i] == arr[j]) {
        visited[j] = true;
        count++;
      }
    }
    System.out.print(arr[i] + " : " + count);
    System.out.println();
  }
}
```


## Optimised Approach

- Using Hashing
- TC -> O(N)

```java
public static void optimisedFreqArr(int[] arr, int n) {
  HashMap<Integer, Integer> hm = new HashMap<>();
  for (int i = 0; i < n; i++) {
    hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
  }
  System.out.println(hm);
}
```