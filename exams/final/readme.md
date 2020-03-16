

## 2020 Winter CSS143B Final &nbsp; &nbsp; &nbsp; Student Name:

**All choice questions are single choice**

**1. (2pt) Which of the following statements about sorting algorithm is FALSE?**

- (A) Heap sort has O(1) space complexity
- (B) Quick sort is stable
- (C) Bubble sort has O(n^2) time complexity  
- (D) Merge sort can be implemented by recursion

**2. (2pt) Which of the following statements about software testing is FALSE?**

- (A) Junit is a Java testing framework
- (B) Tests can be done by comparing actual results from running code with known expcted result  
- (C) Test cases need to cover both possible data inputs and code paths
- (D) If my test passes, my code is correct

**3. (2pt) Which of the following statements about software testing is FALSE?**

- (A) Junit is a Java testing framework
- (B) Tests can be done by comparing actual results from running code with known expcted result  
- (C) Test cases need to cover both possible data inputs and code paths
- (D) If my test passes, my code is correct

**4. (2pt) Which of the following statements about the dictionary ADT is FALSE?**

- (A) Chaining can be used to solve the collision problem
- (B) Dictionary always has O(1) time complexity for entry retrieval 
- (C) Dictionary can be implemented with array
- (D) The hash function that generates hash key needs to have low complexity (in another words, FAST)



**5. (2pt) Suppose you accidently added a .class file to your github repository. Describe the steps you'd take to remove this file from the repo?**

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

1. (2pt) Explain why the value of the variable ***sortedMap*** is a Set instead of a String.

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

4. (4pt) Analyze the time complexity for generating ***sortedMap*** in big O notation?

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

Please list what is the problem with the above code and then give the new code that does the same but with improved quality.

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

2. (5pt) This tree also happens to be a heap tree. Write down how this tree is stored as a heap that's implemented using an array**

```bash

[                                  ]

```



**10. (20pt) Given a single linked list with dummy node, write the code to iteratively reverse the 2nd half of the list in place.**

1. (15pt) Write the code given the following list node definition

   ```java
   public class ListNode {
       int val;
       ListNode next;
       public ListNode(int val) {
           this.val = val;
           this.next = null;
       }
       public void reverse2ndHalf() {
         // your code here
       }
   }
   ```

For example, 

```bash
Input: h-->1-->2-->3, output: h-->1-->2-->3
Input: h-->1-->2-->3-->4, output: h-->1-->4-->3
Input: h-->1-->2-->3-->4-->5, output: h-->1-->2-->3-->5-->4
Input: h-->1-->2-->3-->4-->5-->6, output: h-->1-->2-->3-->6-->5-->4
```

The reversal is to be done **in place** like the regular iterative reversal.



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

1. (2pt) Why is ***speak()*** defined as ***abstract*** in the Animal class?

```bash


```

2. (2pt) What does "@Override" mean?

```bash


```

3. (2pt) What does ***super(name, gender, age)*** do?

```bash

```

4. (2pt) The ***Animal*** class is defined as an abstract class. But Java also has ***interface***. What's the difference between an abstract class and interface in Java?

```bash


```

5. (2pt) What is the output of the following code?

```java
Animal animal;
animal = new Cat("coco", "he", 13, "black");
animal.speak();
```



**12. (20pt) Write the code to check if two binary trees are identical**

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

***isIdentical*** returns true is both tree are identical (same shape, same node values in all the nodes). False otherwise. For example

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

2. (10pt) Write a test plan for your code. List your test cases with specific binary tree inputs.

```bash




```

***Bonus Points***

From the "unique path" problem we dicussed in lecture, the following recursion solution was given

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



