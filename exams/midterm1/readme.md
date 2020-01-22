## 2020 Winter CSS143B Midterm 1 &nbsp; &nbsp; &nbsp; Student Name:

**1. (2pt) The "void" methods like**
```java
void foo() {}
```

- (A) return Strings.
- (B) return primitive type values.
- (C) have no return value.
- (D) return class-type values.

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
<br/>
<br/>
<br/>

**8. (4pt) In binary search**

```java
int mid = (start + end)/2;
```
what's the potential issue with the above code and how to fix it?
<br/>
<br/>
<br/>
<br/>
<br/>

**9. (10pt) Write a function to reverse an integer array in place**

For example, if the input is [3,2,1,4], the output should be [4,1,2,3]
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

**11. (5pt) How would you test your reverse function? Write down the test cases as you think necessary**
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

**12. (5pt) Given the following class**
```java
public class Student {
  int age;
  String name;
}
```
Implement the constructor, setter and getter functions for this class
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

**13. (5pt) What does "late binding" mean?**
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

**14. (15pt) Write a function check if an array is sorted in ascending order**
```java
public static void isSortedAscending(int[] data) {







}
```

**15. (10pt) For the following code:**
```java
public abstract class Animal {
  private String name;
  public abstract void play();
}
public class Cat extends Animal {
  private String furColor;
  @Override
  public void play() {
      System.out.println("Cat " + getName() + " is sleeping");
}
public class Dog extends Animal{
  private String owner;
  @Override
  public void play() {
      System.out.println("Dog " + getName() + " is outside playing");
}
```
Suppose there are a Cat object where name is "coco", and a dog object where name is "Mika", what's the output of the following code
```java
Animal animals[] = new Animal[2];
animals[0] = dogNamedMika;
animals[1] = catNamedCoco;
for (int i=0; i<animals.length; i++) {
  animals[i].play();
}
```
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

**16. (15pt) Implement the enqueue() function for ArrayQueue that stores data circularly in the internal array**

The interface of the Queue is 
```java
public interface Queue {
  boolean enqueue(int val);
  QueueElement dequeue();
  int size();
}
```

And the ArrayQueue is 
```java
public class ArrayQueue implements Queue {

  private int data[];
  private int size;

  // data removed from this side --> [front....end] <-- data added from this side
  private int front;
  private int end;
  
  // enqueue return true when enqueue is successful. false otherwise.
  @Override
  public boolean enqueue(int val) {








}
```

**17. (5pt) What are the pros and cons of implementing stack and queue using array in terms of size and performance?**
<br/>
<br/>
<br/>
<br/>
<br/>

**18. (5pt) What's the difference between an abstract class and an interface?**
<br/>
<br/>
<br/>
<br/>
<br/>
