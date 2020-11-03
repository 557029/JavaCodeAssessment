# JavaCodeAssessment
Java Code Assessment

Tasks:
1.	Write class that implements below interface. Write a function (using Java syntax) that prints out the numbers 1 to 500 with the following constraints:
	1)  For multiples of six print "Fizz" instead of the number.
	2)  For multiples of ten print "Buzz". 
	3)  For numbers which are multiples of both six and ten print "FizzBuzz".
  ```java
public interface IFizzBuzz {
	public void doFizzBuzz();
}
```
2.	Write an implementation of the Reverser interface which takes two strings and returns true if and only if the first string is the reverse of the second string. Multiple different implementations are encouraged.
	- Example: isReverse("abc", "cba") returns true
	- Example: isReverse("abc", "xyz") returns false
```java  
public interface Reverser 
{
	public boolean isReverse(String string1, String string2);
}
```

3.	Write a "Square" class that implements the below Shape interface. Multiple different implementations are encouraged.
```java
public interface Shape 
{
	public int perimeter();
	public int area();
}
```
4.	Write an implementation of the Fibonacci interface which computes the Nth Fibonacci number. Multiple different implementations are encouraged. 
	getFibonacci(n) = sum of last two Fibonacci numbers. 
	- getFibonacci(0) = 0
	- getFibonacci(1) = 1
	- getFibonacci(2) = 1
	- getFibonacci(3) = 2
	- getFibonacci(4) = 3
```java
public interface Fibonacci 
{
	public int getFibonacci(int n);
}
```
5.	Write a program to print all prime numbers from 1 to 100.  A prime number is a number which is greater than 1 and only divisible by 1 or itself.  Please use the interface below to determine if a number is prime for your program.

Examples:
- isPrime(5) returns true.
- isPrime(6) returns false.

Interface:
```java
public abstract interface PrimeNumber
{
public boolean isPrime(int number);  
}
```


