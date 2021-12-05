<img src="https://webassets.telerikacademy.com/images/default-source/logos/telerik-academy.svg" alt="logo" width="300px" style="margin-top: 20px;"/>

# Algorithm Complexity Tasks

Define the complexity of each program/algorithm.

## Task 1

```java
static int product(int a, int b) {
    int sum = 0;
    for (int i = 0; i < b; i++) {
        sum += a;
    }
    return sum;
}
```

> Answer: $`O(n)`$ where $`n = b`$.

## Task 2

```java
int power(int a, int b) {
    if (b < 0) {
        return 0;
    }
    if (b == 0) {
        return 1;
    }
    int power = a;
    while (b > 1) {
        power *= a;
        b--;
    }
    return power;
}
```

> Answer: $`O(n)`$ where $`n = b`$.

## Task 3

```java
int mod(int a, int b) {
    if (b < 0) {
        return -1;
    }
    int div = a / b;
    return a - div * b;
}
```

> Answer: $`O(1)`$

## Task 4

```java
static int sum3(int n) {
    int sum = 0;
    for (int a = 0; a < n; a++) {
        for (int b = 0; b < n; b++) {
            for (int c = 0; c < n; c++) {
                sum += (a * b * c);
            }
        }
    }
    return sum;
}
```

> Answer: $`O(n^3)`$. The number of elementary steps is ~$`n^3`$.

## Task 5

```java
static int sumNM(int n, int m) {
    int sum = 0;
    for (int a = 0; a < n; a++) {
        for (int b = 0; b < m; b++) {
            sum += (a * b);
        }
    }
    return sum;
}
```

> Answer: $`O(nm)`$. The number of elementary steps is ~$`n*m`$.

## Task 6

```java
static int sumNM(int n, int m) {
    int sum = 0;
    for (int a = 0; a < n; a++) {
        for (int b = 0; b < m; b++) {
            if (a == b) {
                for (int c = 0; c < n; c++) {
                    sum += (a * b * c);
                }
            }
        }
    }
    return sum;
}
```

> Answer: $`O(nm)`$. The number of elementary steps is ~$`n*m + min(m, n) * n`$.

## Task 7

```java
static int factorial(int n) {
    int factorial = 1;
    while (n > 1) {
        factorial *= n;
        n--;
    }
    return factorial;
}
```

> Answer: $`O(n)`$. The number of elementary steps is ~$`n`$.