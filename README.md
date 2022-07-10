# SortManager

The sort manager contains 3 different sections to the the code.

### The controller 
The controller handles the logic of the program and links the data from the view and model together.
### The model 
The model stores the data needed for the program.
### The view
The view visualises and outputs the information that is gathered from the data.

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
To compare the 4 algorithms I ran the sort manager 5 times on a random unsorted array of size n where n is a constant during the tests. 
### `n = 8`
- Bubble Sort: 125033.2 nanoseconds
- Merge Sort: 122533.2 nanoseconds
- Insertion Sort: 103133.4 nanoseconds
- Tree Sort: 77342 nanoseconds

Fastest: Insertion Sort `O(n^2)`
### `n = 200`
- Bubble Sort: 199459.2 nanoseconds
- Merge Sort: 211833.2 nanoseconds
- Insertion Sort: 343458.2 nanoseconds
- Tree Sort: 524125 nanoseconds

Fastest: Bubble Sort `O(n^2)`
### `n = 1000`
- Bubble Sort: 4803875.2 nanoseconds
- Merge Sort: 605709.2 nanoseconds
- Insertion Sort: 430791.2 nanoseconds
- Tree Sort: 1028000 nanoseconds

Fastest: Insertion Sort `O(n^2)`
### `n = 10000`
- Bubble Sort: 105275417.2 nanoseconds
- Merge Sort: 4684708.2 nanoseconds
- Insertion Sort: 17702292.2 nanoseconds
- Tree Sort: 58654000 nanoseconds

Fastest: Merge Sort `O(nlogn)`
### `n = 100000`
- Bubble Sort: 15237924250.2 nanoseconds
- Merge Sort: 16304250.2 nanoseconds
- Insertion Sort: 499077708.2 nanoseconds
- Tree Sort: 4287245041 nanoseconds

Fastest: Merge Sort `O(nlogn)`

To conclude, we found out that despite merge sort and tree sort having the faster time complexity, the size of the data and the order of the array makes alot of difference. For smaller size arrays the difference in speeds is not noticiable between the 4 algorithms, however once you start working with big data the sorting algorithms that you implement start to matter and thats where time complexity becomes an issue.

