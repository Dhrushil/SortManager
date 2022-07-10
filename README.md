# SortManager
# SortManager

The sort manager contains 3 different sections to the the code.

The controller, the model, the view.

The project contains the following 4 algorithms and you have the ability to compare them with each other.

### Bubble Sort
The bubble sort algorithm consists of comparing every digit in the array with one another and sorting them regarding on your parameters.
To analyse the bubble sort we can solve the recurrence relation of the algorithm. At worst case the recurrence relation for bubble sort is:
```
T(n) = T(n-1) + n - 1
T(2) = 1 //Base Case
```
Using the subsitution method we can solve this recurrence relation to be equivalent to 
`Worst Case = O(n^2)`

As for the best case for bubble sort, we have the following recurrence relation:
```
T(n) = T(n−1)+1
T(2) = 1 //Base Case
```
Which using the subsitution method we can solve this recurrence relation to be equivalent to `Best Case =  Ω(n)`

### Merge Sort
The merge sort algorithm relies on recursively splitting the array in half until you have 2 elements in each array, you then merge the arrays together by comparing the values in the sub arrays.
To analyse the merge sort algorithm we can solve the recurrence relation of the algorithm. At worst case the recurrence relation for merge sort is:
```
T(n) = 2T(n/2) + O(n)
```
Which by solving the recurrence relation using subsitution we can find out that the worst case to be `O(nlogn)`
In merge sort the worst case and best case scenario are both the same.
### Tree Sort
The tree sort algorithm relies on a binary search tree. The purpose of a bst is to initialise a root node, then every element in the array will be compared to the root node, if it is smaller than the root it goes to the left of the tree and if it is larger it goes to the right of the tree.
To analyse the tree sort algorithm we need to find the recurrence relation for the algorithm. The recurrence relation is:
```
T(n)=T(n/2)+1+O(n)
```
Which by subsitution we can solve this to be at Worst Case `O(nlogn)`
Much like merge sort, tree sort also has a Best Case of `Ω(nlogn)`
### Insertion Sort
The insertion sort algorithm has a recurrence relation of: 
```
T(n) = T(n-1) + n
```
which by subsition results in the worst case of `O(n^2)`
and has a best case of `Ω(n)`

## Comparision

