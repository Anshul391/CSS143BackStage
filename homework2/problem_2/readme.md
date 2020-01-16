## (40pt) Stack ADT Using Array

In the class we have seen the example of a Queue ADT using array. In this problem you will implement a stack ADT similarly also using array.

A stack is defined as a FIRST IN LAST OUT data structure with the following operations:

- boolean push(int v) : add an integer v onto the top stack, and return a boolean indicating whether push was successful
- boolean pop() : remove an integer from the top of the stack, and return a boolean indicating whether pop was successful
- int peek() : return the value at the top of the stack

### The ArrayStack Class (10pt)

Following the exmaple of ArrayQueue from class, implement the following functions in ArrayStack.java:
- push
- pop
- peek
- constructor ArrayStack

### Tests for the ArrayStack Class (10pt)

Following the exmaple of ArrayStack from class, implement the following functions in Tests.java:
- testArrayStackOfSizeOne
- testArrayStackOfSizeTwo
- testArrayStackOfSizeThree

Note that push, pop and peek all need to be verified in these tests.

### Remove Outermost Parentheses

Now that you finished the awesome Stack ADT, let's put it to some use to solve the following problem.

The task is to use Stack to check if the given parentheses string is *valid*. A "valid" parentheses string can be:
- empty
- ()
- (()) and ()()
- ((())), (()()), ()()(), ()(())

On the countrary, the following are not "valid" parentheses string:
- (()
- ()())
- )(




