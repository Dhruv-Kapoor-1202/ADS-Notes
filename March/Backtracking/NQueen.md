# NQueen

```
Queens(arr, i) 

if (i == n) 



for (int j = 0; j < n; j++) {
    if (isValid(i)) {
      arr[i][j] = 1;
      Queens(arr, i + 1);
      arr[i][j] = 0;
    }
}
```

|     | 0    | 1    | 2    | 3    |
| --- | ---- | ---- | ---- | ---- |
| 0   | 0, 0 | 0, 1 | 0, 2 | 0, 3 |
| 1   | 1, 0 | 1, 1 | 1, 2 | 1, 3 |
| 2   | 2, 0 | 2, 1 | 2, 2 | 2, 3 |
| 3   | 3, 0 | 3, 1 | 3, 2 | 3, 3 |


create two arrays to optimise the `isValid()` function  
- one for diagonals (difference of i and j)
- one for anti-diagonals (sum )