# Check Prime

```java
public static boolean isPrime(int num) {
  if (num <= 1)
    return false;

 // for (int i = 2; i <= Math.sqrt(num); i++) {
 //               OR
  for (int i = 2; i <= num / i; i++) { // num / i and Not i * i as i * i could exceed integer limit
    if (num % i == 0) {
      return false;
    }
  }
  return true;
}
```

```java
public static int countPrime(int num) {
  int count = 0;
  for (int i = 0; i <= num; i++) { 
    if (isPrime(i))
      count++;
  }
  return count;
}
```


# Seive Of Eratosthnes

For calculating prime numbers  

- Cancelling out multiples of the prime numbers that get calulated along the way and not traversing those elements