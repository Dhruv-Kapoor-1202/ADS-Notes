# Prefix Array

## Prefix Sum

```
arr[] = {1, 2, 3, 4, 5, 6}

output -> 1 3 6 10 15 21

arr[i] = sum of elememts from index 0 to that index
```

### Brute Force

```java
public static void main(String[] args) {
  int[] arr = { 1, 2, 3, 4, 5, 6 };

  int[] newArr = preArr(arr);

  for (int ele : newArr) {
    System.out.print(ele + " ");
  }
}
```

```java
public static int[] preArr(int[] arr) {
  int n = arr.length;

  int[] output = new int[n];
  int sum;
  for (int i = 0; i < n; i++) {
    sum = 0;
    for (int j = 0; j <= i; j++) {
      sum += arr[j];
    }
    output[i] = sum;
  }
  return output;
}
```

### Optimised

```java 
public static void main(String[] args) {
  int[] arr = { 1, 2, 3, 4, 5, 6 };

  optimisedPreSum(arr);

  for (int ele : arr) {
    System.out.print(ele + " ");
  }
}
```

```java 
public static void optimisedPreSum(int[] arr) {
  int n = arr.length;
  for (int i = 1; i < n; i++) {
    arr[i] += arr[i - 1];
  }
}
```

## Sum Of Array between indices L to R

```
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
int[][] arr1 = {{1, 2}, {1, 7}, {2, 6}, {4, 5}};  // Starting index, ending Index

output => 3 28 20 9
```

### Brute Force

```java
public static void main(String[] args) {
  // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
  int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1 };
  int[][] arr1 = { { 1, 2 }, { 1, 7 }, { 2, 6 }, { 4, 5 } };

  printSum(arr, arr1);
}
```

```java
public static void printSum(int[] arr, int[][] arr1) {
  int m = arr1.length;

  int sum;
  for (int i = 0; i < m; i++) {
    sum = 0;
    for (int j = arr1[i][0]; j <= arr1[i][1]; j++) {
      sum += arr[j - 1];
    }
    System.out.print(sum + " ");
  }
}
```


### Optimised Approach

```java
public static void main(String[] args) {
  int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
  // int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1 };
  int[][] arr1 = { { 1, 2 }, { 1, 7 }, { 2, 6 }, { 4, 5 } };

  printSum(arr, arr1);
}
```

```java
public static void printSum(int[] arr, int[][] arr1) {
  // First We calculate the Prefix sum array
  int n = arr.length;
  for (int i = 1; i < n; i++) {
    arr[i] += arr[i - 1];
  }

  int m = arr1.length;
  int sum;
  for (int i = 0; i < m; i++) {
    if (arr1[i][0] == 1) {
      System.out.print(arr[arr1[i][1] - 1] + " ");
      continue;
    }
    sum = arr[arr1[i][1] - 1] - arr[arr1[i][0] - 2];
    System.out.print(sum + " ");
  }
}
```