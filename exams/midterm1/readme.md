## 2019 Autumn CSS342 C Midterm &nbsp; &nbsp; &nbsp; Student Name:

**1. (2pt) Single choice. Choose the correct one. What does "Modular design" mean in terms of Object-Oriented Design?**

- Split a problem into modules
- Each modules states what it does
- No module “know” how any other module works
- All the above

**2. (4pt) What is the output of the following code**

```c++
#include <iostream>
using namespace std;
int operate (int a, int b) {return (a * b);}
double operate (double a, double b) {return (a + b);}
int main () {
    cout << operate (1.5, 2.3) << '\n';
    cout << operate (4, 5) << '\n';
    return 0;
}
```
<br/>
<br/>

Question 3 and 4 are for the following code:
```c++
#include <iostream>
void foo(int* x, int& y) {
    int* z = &y;
    y = *x;
    *x = *z;
}
int main() {
    int a = 45, b = 35;
    foo(&a, b);
    printf("a=%d, b=%d\n", a, b);
}
```

**3. (4pt) What types of parameter passing are used in foo(int\* x, int& y) ?** 
<br/>
<br/>

**4. (2pt) What is the output of this code?**
<br/>
<br/>

**5. (4pt) In the following code**
```c++
class Array{
  int* data;
public:
  int size;
  Array(int size) : size(size) {
          data = new int[size];
  }
  int &operator[](int i) { return data[i]; }
  ~Array() { delete [] data; }
};
int arraySum(Array array) {
    int sum = 0;
    for (int i=0; i<array.size;i++) {
        sum += array[i];
    }
    return sum;
}
```
Function arraySum(Array array) is supposed to return the sum of all values in an object of type class Array but it's returning wrong value based in tests. What is the bug? And describe how you would fix it?
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

**6. (2pt) What's the issue with the following code? And how would you improve it?**
```c++
try {
     work();
} catch (Throwable t) {
}
```
<br/>
<br/>
<br/>

**7. (2pt) In a C++ class, what is the purpose of using a destructor in C++?**
<br/>
<br/>
<br/>

**8. (4pt) What's the output of the following code?**
```c++
#include <iostream>
using namespace std;
class note {
public:
    virtual void text() {cout << " has bad traffic";};
    ~note() { cout << ", says in a note";}
};
class noteA: public note{
public:
    void text() {cout << "Seattle";}
    ~noteA() { cout << ", says in note A";}
};
class noteB : public note{
public:
    void text() {cout << " is awesome";}
};
int main() {
    note* notes[2];
    notes[0] = new noteA;
    notes[1] = new noteB;
    for (int i=0; i<2; i++) { notes[i]->text(); }
    for (int i=0; i<2; i++) { delete notes[i]; }
}
```
<br/>
<br/>
<br/>

**9. (4pt) Convert the folowing class to a template class. Please mark the changes directly in the code.**
```c++
#include "math.h


class ComplexNumber {
    float x;
    float y;
public:
    ComplexNumber(float x, float y) : x(x), y(y) {}
    float distance() { return sqrt(x*x + y*y);}
};
```
<br/>

**10. (2pt) What is Makefile for? And how to use it?**
<br/>
<br/>
<br/>
<br/>

**11. (5pt) What's unit test? If we write both function code and test, and the test we write will pass at last, what's the point of having any test?**
<br/>
<br/>
<br/>
<br/>

**12. (5pt) If you are given a function sort() that will sort an array of integers in ascending order:**
```c++
void sortInAscendingOrder(int *data);
```
What test cases would you write to verify sort() works correctly?
<br/>
<br/>
<br/>
<br/>
<br/>

**13. (2pt) Single choice. What does the C++ Standard Template Library NOT provide?**

- Containers such as list, queue, stack, etc
- Algorithm such as sorting, searching, etc
- Iterator to step through elements of collections
- compilers and makefile that support compiling and debugging code

**14. (3pt) What does this code do? And what's the difference between std::vector and C++ array in terms of memory layout of elements?**
```c++
std::vector<double> v{ 1.1, 5.2, 8 }; 
```
<br/>
<br/>
<br/>
<br/>

**15. (5pt) What's the difference between Stack and Queue in terms of access pattern?**
<br/>
<br/>
<br/>

**16. (5pt) For an ADT class that manages a collection of data (for example, a set of integers) and requires faster random access, what data structure would you choose between array and single linked list? Explain your choice? And discuss the limitation of your choice of data structure.**

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

**17. (5pt) What is an iterator for a linked list and what is it used for?**
<br/>
<br/>
<br/>
<br/>

**18. (10pt) If you are implementing a Stack using a single linked list, which end of the list would you use for both push() and pop()? Explain your reasoning.**
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>


**Questions 19 and 20 are based on the following code**
```c++
class ListNode {
public:
    ListNode() : val(0), next(nullptr) {}
    int val;
    ListNode *next;
};

class SingleLinkedList {
private:
    ListNode *head;
public:
    SingleLinkedList() {
        head = new ListNode();
    }
    ~SingleLinkedList();
    int midPoint();
    int size();
};
```
**19. (15pt) Implement the size() member function that returns the number of nodes in the list.**
For example: 
- if the input list is empty, return 0;
- if the input list is 1->N, return 1;
- if the input list is 1->2->N, return 2;
- if the input list is 1->2->3->N, return 3;
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
<br/>
<br/>

**20. (15pt) Implement the midPoint() member function that returns the value of the node at the middle of the list.** 
For example: 
- if the input list is empty, return -1;
- if the input list is 1->N, return 1;
- if the input list is 1->2->N, return 1 or 2, both are fine;
- if the input list is 1->2->3->N, return 3
- if the input list is 1->2->3->4->N, return 2 or 3, both are fine;
- if the input list is 1->2->3->4->5->N, return 3.
N represents nullptr, and note that this list has a dummy head pointer. 
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
<br/>
<br/>
