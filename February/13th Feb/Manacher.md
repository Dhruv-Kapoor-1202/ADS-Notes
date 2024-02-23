# Manacher's Algo

For finding the longest palindromic substring.


- Naive approach can lead to the complexity of 0(n^3);
- `THE ORIGINAL Manacher Algo only works on **ODD LENGTH STRINGS**`
- the new algo uses strign manipulation to overcome this.
  
```
ABA

ABBA

@A@B@B@A@ (one special character)

final (optional)
$@A@B@B@A@%  (three special characters)


```
## Steps

1. Create an array or a list (sChars) of length strLen which is `2*n + 3` (three special characters) (n being the length of the given string), to modify the given string
2. Assign the first and last element of sChars to be "@" and "$", respectively
3. Fill the blank spaces in sChars bu characters of the given string and "#" alternatively.
4. Declare variables
   1. Implicatin maximum detected length of palindrome substring maxLen = 0;
   2. Position from where to strart searching start = 0
   3. highest position od the extreme right character of all detected palindromes maxRight = 0;
   4. Center of the detected palindrom center = 0
5. Create an array p[] to record the width of each palindrome about their center, center being the corresponding characters in sChars.
6. Create a for loop iteratign frm 1 to strLen - 1, with i increamening in each iteration
7. In each iteration, check if i < maxRight, if yes, then assign minimum of maxRight - i










