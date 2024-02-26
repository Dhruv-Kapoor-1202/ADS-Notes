# KADANE's Algorithm (TC -> O(n))

Max Sum of a Sub array

```
[1, 1, -1, -2, 5]

i   sum     maxSum
0   1       1
1   2       2
2   1       2
3   -1 ->0  2
4   5       5 

```

Whenever the sum becomes negative, we assign sum = 0

