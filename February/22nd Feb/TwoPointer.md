# Two Pointer

- when we want to find  pairs
- ideally better when we have a sorted collection
- Time Complexity
  - sorted - O(n)
  - unsorted - O(nlogn)


## Sum Pair
```
// Pairs, not necessarily adjacent  

int arr[] = {10, 20, 30, 40, 50}
requiredSum (k) = 30
```

`Naive Approach`

```java
for (int i = 0; i < n; i++) {
  for (int j = i + 1; j < n; j++) {
    if (arr[i] + arr[j] == k) {
      return true;
    }
    if (arr[i] + arr[j] > k) { // Reducing Number of iterations
      break;
    }
  }
}
```

`Optimised Approach`



```java

/** 
 * Only Works When the arr is sorted
*/
public static boolean optimisedApproach(int[] arr, int k, int n) {
  int i = 0;
  int j = n - 1;
  int sum = 0;

  while (i < j) {
    sum = arr[i] + arr[j];
    if (sum == k) {
      return true;
    } else if (sum < k) {
      i++;
    } else {
      j--;
    }
  }
  return false;
}
```

## Move all Zeros to end of array

```
int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};

output -> 1 2 3 4 0 0 0 0
```

`TC -> O(n)`

```java
public static void moveZero(int[] arr, int n) {
  int i;
  int j = 0;
  for (i = 0; i < n; i++) {
    if (arr[i] != 0 && arr[j] == 0) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    if (arr[j] != 0) {
      j = j + 1;
    }
  }
}

```

## Rearrange Array in max min using two pointer

```
int[] arr = {1, 2, 3, 4, 5, 6}
output => 6 1 5 2 4 3

even index -> descending order
odd index -> ascending order


int[] arr = {1, 2, 3, 4, 5, 6, 7} 
output => 7 1 6 2 5 3 4
```


### `Only Printing`
```java
public static void printMinMax(int[] arr, int n) {
  int i = 0;
  int j = n - 1;

  while (i < n / 2) {
    System.out.print(arr[j] + " " + arr[i] + " ");
    j--;
    i++;
  }
  if (n % 2 != 0) {
    System.out.println(arr[n / 2]);
  }
}
```


### `replacing in-place`

not possible without using a second array