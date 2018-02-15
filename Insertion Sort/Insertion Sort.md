## Insertion Sort
A simple sorting algorithm that sorts an array one item at a time. Best for small sets of data, but very inefficient for larger datasets.
**Best-case performance:** O(n)
**Worse-case performance:** O(n^2)
**Average:** O(n^2)

**Steps**
1. Iterate over all of the elements in the array, starting at the first element in the array.
  * The first element in the array is already sorted, so we leave this one alone.
2. For each element we come across, we check if the element is larger than the largest element in the sorted array.
3. If it is larger, then we move on.
4. If it not larger than the largest element in the array, then we move it to the appropriate place in the sorted array.

**Pseudocode**
``` i ← 1
 while i < length(A)
     j ← i
     while j > 0 and A[j-1] > A[j]
         swap A[j] and A[j-1]
         j ← j - 1
     end while
     i ← i + 1
 end while
 ```

![InsertSort](https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif)

```C++
     *3* 7 4 9 5 2 6 1
      3 *7* 4 9 5 2 6 1
      3 7 *4* 9 5 2 6 1
      3 4 7 *9* 5 2 6 1
      3 4 7 9 *5* 2 6 1
      3 4 5 7 9 *2* 6 1
      2 3 4 5 7 9 *6* 1
      2 3 4 5 6 7 9 *1*
      1 2 3 4 5 6 7 9
```
