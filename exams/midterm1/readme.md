## 2019 Autumn CSS342 C Midterm &nbsp; &nbsp; &nbsp; Student Name:


**1. (2pt) Single choice. Consider the following definition of a method in a class:**
```java
public void doThis(int x, double y)
```
Which of the following is a legitimate case of overloading doThis in the class definition?

- (A) private void doThis(int x, double y)
- (B) public void doThis(int a, double b)
- (C) public void doThis(int a, double b, double c)
- (D) public void doThis(int x, int y)

**2. (2pt) Single choice.**
Given we have a class FooClass that has two public instance variables, x and y, both of which are int and are each set to 2 on instantiation of an instance of the class.

Consider the following code:
```java
MooClass a = new MooClass();
MooClass b = new MooClass();
b.x = a.y + 4;
a = b;
a.y = 7;
System.out.println(b.x + " " + b.y);
```
What is output by the above code?
- (A) 2 7
- (B) 6 2
- (C) 2 2
- (D) 6 7
- (E) 4 7

**3. (2pt) Consider the following code:**
```java
public static void foo(String str) {
  str.concat("rains too much");
}
public static void main(String[] args) {
  String str = "seattle ";
  foo(str);
  System.out.println("After calling foo: " + str);
```
What is output by the above code?
<br/>
<br/>
<br/>
<br/>

**4. (2pt) Single choice:**
The ***new*** operator
- (A) creates an object of a class.
- (B) returns the memory location of a pre-existing object.
- (C) is required when declaring a class-type variable.
- (D) must always be used in the assignment of a class-type variable.

**5. (2pt) Consider the following code:**
```java
public static void foo(StringBuilder builder) {
  builder.append("is blue");
}
public static void main(String[] args) {
  String str = "sky ";
  foo(str);
  System.out.println("After calling foo: " + str);
}
```
What is output by the above code?
<br/>
<br/>
<br/>
<br/>

**6. (2pt) Consider the following code:**
```java
public class Main {
    public static int foo1(int x, int y) {
        return x*2+y+3;
    }
    public static double foo1(double x, double y) {
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println(foo1(10.0, 20.5) + " " + foo1(3, 4));
    }
}
```
What is output by the above code?
<br/>
<br/>
<br/>
<br/>

**7. (4pt) what's the difference between overload and override?**
Hint: answer in terms of function signature AND class relationship (same class vs different class)
<br/>
<br/>
<br/>
<br/>
<br/>

**8. (4pt) In binary search**
```java
int mid = (start + end)/2;
```
what's the issue with the above code and how to fix it?
<br/>
<br/>
<br/>
<br/>
<br/>

**9. (10pt) Write a function to reverse an integer array in place**
For example, if the input is [3,2,1], the output should be [1,2,3]
```java
public static void reverse(int[] values) {







}
```

**10. (5pt) What's the issue with the following testing logic for the above code?**
"For any given array, for example [3,2,1], call the reverse function twice. By reversing the input array twice, the input array should now be the same as before calling any reverse function."
<br/>
<br/>
<br/>
<br/>
<br/>
