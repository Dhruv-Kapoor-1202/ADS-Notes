# Modular Arithmetic

## Addition 

$$
(a + b) \pmod{m} = {(a \pmod{m}) + (b \pmod{m})} \pmod{m}
$$

```math
(6 + 4) % 3 = ((6 % 3) +(4 % 3)) % 3
(10) % 3 = (0 + 1) % 3
1 = 1 % 3
1 = 1
```
- $$ 10^8 + 7 $$
  - largest Prime number within the range of Integer 

## Multiplication

$$
(a * b) \pmod{m} = {(a \pmod{m}) * (b \pmod{m})} \pmod{m}
$$

## Subtraction

$$
(a - b) \pmod{m} = {(a \pmod{m}) - (b \pmod{m} + m)} \pmod{m}

$$

## Division

$$
(a \div b) \pmod{m} = {(a \pmod{m}) \div (b \pmod{m})} \pmod{m}

$$

but it has a unique case 
- if the ` b % m == 0 `