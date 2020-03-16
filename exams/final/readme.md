

## 2020 Winter CSS143B Final &nbsp; &nbsp; &nbsp; Student Name:

**All choice questions are single choice**

**1. (2pt) Which of the following statement about sorting algorithm is FALSE?**

- (A) Heap sort has O(1) space complexity
- (B) Quicksort is a stable sorting algorithm
- (C) Bubble sort has O(n^2) time complexity, n square that is
- (D) Merge sort can be implemented by recursion

**2. (2pt) Which of the following statement about Stack and Queue ADT is FALSE?**

- (A) Stack is First-In-Last-Out
- (B) Queue is Last-In-Last-Out
- (C) Stack can be used to implement a recursive algorithm iteratively
- (D) Queue is implemented with array so its size is limited by the initial capacity

**3. (2pt) Which of the following statement about software testing is FALSE?**

- (A) JUnit is a Java testing framework
- (B) Testing can be done by comparing actual results from running code with known expcted result  
- (C) Test cases need to cover both possible data inputs and code paths
- (D) If my test passes, my code is correct

**4. (2pt) Which of the following statements about the dictionary ADT is FALSE?**

- (A) Chaining can be used to solve the collision problem
- (B) Dictionary always has O(1) time complexity for entry retrieval 
- (C) Dictionary can be implemented with array
- (D) The hash function that generates hash key needs to have low complexity (in another words, FAST)



**5. (2pt) Suppose you accidently added a .class file to your github repository. Describe the steps you'd take to remove this file from your github repo?**

```bash



```

**6. (10pt) You can't handle the truth!**

In the lecture we saw the following code that calculate and sort the word frequency based on part of the movie "a few good men".

```java
        // use map to count the occurrences of each word
        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word)+1);
                continue;
            }
            wordMap.put(word, 1);
        }

        // sort the map based on number of occurrences
        TreeMap<Integer, Set<String>> sortedMap = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            int key = entry.getValue();
            Set<String> values = sortedMap.containsKey(key) ? 
                       sortedMap.get(key) : new HashSet<>();
            values.add(entry.getKey());
            sortedMap.put(entry.getValue(), values);
        }
```

Answer the following question about this code:

1. (2pt) Explain why the entry value of the variable ***sortedMap*** is a Set instead of a String.

```bash




```

2. (2pt) Why is ***sortedMap*** defined as a TreeMap instead of HashMap? 

```bash



```

3. (2pt) Supposed ***wordMap*** has the following data:

```bash
and : 8
men : 1
of : 3
what : 2
we : 3
```

What is the corresponding data in ***sortedMap***?

```bash



```

4. (4pt) Analyze the time complexity for generating data in***sortedMap*** in big O notation? This is referring to the 2nd block of the above code

```bash



```

**7. (5pt) Improve the following code for better code quality?**

```java
        Stack<Integer> test1 = new Stack<Integer>();
        test2.push(-1);
        tests.add(test1);
        Stack<Integer> test2 = new Stack<Integer>();
        test2.push(0);
        tests.add(test2);
        Stack<Integer> test3 = new Stack<Integer>();
        test3.push(1);
        test3.push(0);
        tests.add(test3);
        Stack<Integer> test4 = new Stack<Integer>();
        test4.push(2);
        test4.push(1);
        test4.push(0);
        tests.add(test4);
        Stack<Integer> test5 = new Stack<Integer>();
        test5.push(5);
        test5.push(1);
        test5.push(3);
        test5.push(2);
        tests.add(test5);
```

Please list the problem of the above code in terms of code quality and then provide the improved code

```bash



```


**8. (5pt) Heap can be used to implement a priority queue. However, when the items in the priority queue has the same priority, dequeue() should fall back to the FIFO rule like regular queue, which heap cannot guarentee. Describe your design to solve this problem.**

```bash



```

**9. (20pt) Based on the following tree**

```bash
          41
        /    \
       18    33
      / \    / \
     11  3  1  19 
    /
   5
```

1. (15pt) What is the pre-order, in-order and post-order traversal of the following tree
```bash
pre-order:



In-order:



post-order:

```

2. (5pt) This tree also happens to be a bianry heap tree. Write down how this tree can be stored as a heap using an array

```bash



```



**10. (20pt) Write the code to iteratively reverse THE SECOND HALF of a single linked list in place.**

1. (15pt) Write the code given the following list node definition

   ```java
   public class ListNode {
       int val;
       ListNode next;
       public ListNode(int val) {
           this.val = val;
           this.next = null;
       }
   }
   ```

For example, 

```bash
Input: h-->1-->3-->2, output: h-->1-->3-->2
Input: h-->1-->5-->3-->4, output: h-->1-->5-->4-->3
Input: h-->1-->2-->3-->4-->5, output: h-->1-->2-->3-->5-->4
Input: h-->1-->2-->3-->4-->5-->6, output: h-->1-->2-->3-->6-->5-->4
```

The reversal is to be done **in place** like the regular iterative reversal.

```java
public class Solution {
      public void reverse(ListNode head) {
      // your code here
      // head is the dummy node
    }
}
```



2. (5pt) What's the time complexity of your code in big O notation ?

```bash



```



**11. (10pt) Answer the following questions about the Cats and animal classes**

```java
public abstract class Animal {
    private String name;
    private String gender;
    private int age;
    public abstract void speak();
    public Animal(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}

public class Cat extends Animal {
  private String furColor;
  public Cat(String name, String gender, int age, String furColor) {
        super(name, gender, age);
        this.furColor = furColor;
    }
    @Override
    public void speak() {
        System.out.println("Cat " + getName() + " says 'meow'");
    }
}
```

1. (2pt) Why does the keyword ***abstract*** do in the definition of ***speak()***  in Animal class?

```bash


```

2. (2pt) What does ***"@Override"*** mean?

```bash


```

3. (2pt) What does the call to***super(name, gender, age)*** do?

```bash

```

4. (2pt) The ***Animal*** class is defined as an abstract class. But Java also has ***interface*** type. What's the difference between an abstract class and interface in Java?

```bash


```

5. (2pt) What is the output of the following code?

```java
Animal animal;
animal = new Cat("coco", "he", 13, "black");
animal.speak();
```

```bash


```



**12. (20pt) Write the code to check if two binary trees are identical**

Hint: think recursively.

A binary tree node is defined as the following:

 ```java
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 ```

1. (10pt) Write your solution in 

```java
class Solution {
    public boolean isIdentical(TreeNode tree1, TreeNode tree2) {
      // your code here
    }
}
```

***isIdentical*** returns true is both trees are identical (same shape, same node values in all the nodes). False otherwise. For example

```bash
Input:     3         3
          / \       / \
         8   1     8   1
Output: true

Input:     3         3
          /         / \
         8         8   1
Output: false

Input:     3         3
          / \       / \
         1   8     8   1
Output: false
```

An empty tree is identical to an empty tree.

2. (10pt) Write a test plan for your code. List your proposed test cases with specific binary tree inputs. No need to write actual code.

```bash




```

**(10pt) Bonus Points**

For the "unique path" problem we dicussed in lecture, the following recursion solution was given

```java
    public static int uniquePaths(int m, int n) {
        if (m!=0 && n!=0) {
            System.out.printf("%d,%d\n", m, n);
        }
        if (m==0 || n==0) {
            return 0;
        }
        if (m==1 && n==1) {
            return 1;
        }
        return uniquePaths(m-1, n) + uniquePaths(m, n-1);
    }
```

This implementation has bad performance because of the "repeated subprobem". Re-write this with an iterative solution that trades (uses) space for better time performance.  

```java
    public static int uniquePathsIterative(int m, int n) {
			// your code here
    }
```

Discuss the big O time complexity of this iterative method.

```bash




```



