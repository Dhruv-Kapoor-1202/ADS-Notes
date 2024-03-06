# Counting Sort

Used when the size of the array is greator than the maximum element int he array.  
  
`TC -> (O(N + M))`  
N -> Size of the Array  
M -> Max Element  


```
Input Array -> 5 3 1 2 4 1 2

max = 10;
int[] countArr = new int[max + 1]
Arrays.fill(countArr, 0)
```

* Doesnt work on negative numbers

Steps : 
- First find the max element in the array. 
- Create the countArray whose size is maxElement + 1.
- initialize all the values of the array as 0.
- increase the count at the index of (countArray) of the number inside the inputArray.
- Prefix Sum 
- All hell breaks loose


```java
public static int[] countSort(int[] inputArr) {
  int n = inputArr.length;
  int max = 0;
  for (int i : inputArr) {
    max = Math.max(i, max);
  }

  int[] countArr = new int[max + 1];

  for (int i = 0; i < n; i++) {
    countArr[inputArr[i]]++;
  }

  // Prefix Array
  for (int i = 1; i < countArr.length; i++) {
    countArr[i] += countArr[i - 1];
  }

  int[] outputArr = new int[n];

  for (int i = n - 1; i >= 0; i--) {
    outputArr[countArr[inputArr[i]] - 1] = inputArr[i];
    countArr[inputArr[i]]--;
  }

  return outputArr;
}
```
