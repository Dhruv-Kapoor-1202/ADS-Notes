# Recursion

## Types

- Direct
  - function calls itself
    - head
    - tail
    - tree
      - more than one recursion calls in one function 
- Indirect
  - 2nd function calls the first function and 1st function 

# Sorting 

- adaptive 
- non adaptive



## Adaptive
### Bubble Sort

- Comparing the adjacent elements in the array and swap.
- moves the largest element to the right
- OG algo takes (<=), so thats why it is unstable

### Insertion Sort

- Sorted array + unsorted array.
- It starts from 1st index(2nd element), compared key value with sorted array (all elements of the left side of key value in array) shifts the smallest value of left. 
- Best O(n)
- average O(n^2)
- worst O(n^2)
- inverse of bubble sort
  - moves the smallest value in the front
- Stable sorting technique
  - when two elements are same, it doesnt change their index.

### Quick sort

- Pivot element can be any element but it should remain the same 
- it follows divide and conquer rule,
- find pivot element
- divide it into sub arrays,
- left array i.e. smaller than pivot element
- right array i.e. greator than pivot element
- at a time only one index gets sorted

```
 1 2 5 7 8 9 4 3 

 pivot 3

 1 2 3 5 7 8 9 4
```

# Non Adaptive

## Selection Sot

- works only on small data set
- similar to insertion sort, but when condition is true, it swaps 
- it is considered on array, insertion sort is considered two sub arrays. 
- unstable
- best case - O(n^2)


## Merge Sort

- it follows divide and conquer rule
- it divides array in subarrays, until only single element remain.
- it sorts data while merging.