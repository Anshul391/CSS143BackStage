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


