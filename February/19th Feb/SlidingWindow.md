# Sliding Window

## Types of Sliding Window

- Fixed size window
- variable window size  
  - dependent on a pattern's existance

## Sub array

```
1 2 3 4 5 

1 
1 2 
1 2 3
1 2 3 4 
1 2 3 4 5
2
2 3 
and so on

SubArray

for (int i = 0; i < n; i++) 
  for (int j = i; j < n; j++)
    for (int k = i; k <= j; k++) 

```

## Sliding Window

- returns two things : the array and the size of the array(sub array)
- the size of the subarray(window) should remain the same

```
1 2 3 4 5 

1 2 
2 3 
3 4 
4 5
```

```java
public static void main(String[] args) {
  int[] arr = {1, 2, 3, 4, 5};
  int w = 2;
  subarray(arr, w);
}
```


```java
public void subarray(int[] arr, int w) {
  // Time Complexity : O(n^2 * k)
  int n = arr.length;
  for (int i = 0; i < n; i++) {
    int len = 0;
    for (int j = i; j < n; j++) {
      len++;
      if (len == w) {
        for (int k = i; k <= j; k++) {
          System.out.print(arr[k]);
        }
      }
    }
  } 
}
```

```java
public void betterSubArray(int[] arr, int w) {
  int n = arr.length;
  for (int i = 0; i < n - w + 1; i++) {
    for (int j = i; j < i + w; j++) {
      System.out.println(arr[j]);
    }
  }
}

```

### Sum of minimum and maximum of all the subarrays

```java
public static void main(String[] args) {
  int[] arr = {1, 2, 3, 4, 5};
  int w = 2;
  subarray(arr, w);
}
```
```java
public void minMax(int[] arr, int w) {
  int n = arr.length;

  int totalSum = 0;
  for (int i = 0; i < n; i++) {
    int len = 0;
    for (int j = i; j < n; j++) {
      len++;
      if (len == w) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int k = i; k <= j; k++) {
          if (min > arr[k]) {
            min = arr[k];
          }
          if (max < arr[k]) {
            max = arr[k];
          }
        }
        totalSum = totalSum + min + max;
      }
    }
  } 
  System.out.println(totalSum);
}
```
```java
public void betterMinMax(int[] arr, int w) {
  int n = arr.length;
  int totalSum = 0;
  for (int i = 0; i < n - w + 1; i++) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int j = i; j < i + w; j++) {
      if (min > arr[k]) {
        min = arr[k];
      }
      if (max < arr[k]) {
        max = arr[k];
      }
    }
    totalSum += min + max;
  }
  System.out.println(totalSum);
}


```


### Count distinct elements in every window of size w

```
int[] arr = {1, 2, 1, 3, 4, 2, 3};
w = 4;
output = 3 4 4 3

1 2 1 3
2 1 3 4 
1 3 4 2
3 4 2 3
```

```java
public class Main{
  public static void main(String[] args) {
    int[] arr = {1, 2, 1, 3, 4, 2, 3};
    int w = 4;
    subarray(arr, arr.length, w);
  }
}
```

```java
public static void subarray(int[] arr, int n, int w) {
  for (int i = 0; i < n - w + 1; i++) {
    System.out.println(count(Arrays.copyOfRange(arr, i, i + w), w));
  }
}

public static int count(int arr[], int w) {
    int distinctCount = 0;
    for (int i = 0; i < w; i++) {
      int j;
      for (j = 0; j < i; j++) {
        if (arr[i] == arr[j]) {
          break;
        }
      }
      if (i == j)
        distinctCount++;
    }
    return distinctCount;
  }
```
