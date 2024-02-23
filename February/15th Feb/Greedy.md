# Greedy Algorithm

## Key Points

1. Local Optimal
   - it follows local optimal choise at each stage, with intend to global optimal 
   - Tree Example.
2. Feasible solution 
   - Multiple choice 
3. Optimal Solution
   - Best Choice
4. Irrevocability
   - If a choice is made, there is no backtracking
   - The selected choice cannot be altered 

## Basic Greedy Algorithm

```
Greedy_Algo {
  for (i = 0 to n) 
    x = selected(a[i]);
    if (feasible(x))
      solution = solution + x
}
```

## Knapsack Problem


```
arr[][] = {{120, 17}, {100, 13}, {60, 8}};
w = 20;
```

```
FOR MAX PROFIT

Profit : (120, 100, 60)
Add Profit : 120, 17
Remaining weight - 3

(remaining weight * current profit / current weight)
3 * 100 / 13 = 23.07

final profit = 120 + 23.07 = 143.07
```

```
FOR MAX WEIGHT

Max Weight : (8, 13, 17) 
Add Profit : 60, 8
Remaining Weight : 12
(remaining weight * current profit / current weight)


```
