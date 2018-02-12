Algorithm Analysis Cheat Sheet

## Insertion Sort
A simple sorting algorithm that sorts an array one item at a time. Best for small sets of data, but very inefficient for larger datasets.
**Best-case performance:** O(n)
**Worse-case performance:** O(n^2)
**Average:** O(n^2)

**Steps**
1. Iterate over all of the elements in the array, starting at the first element in the array.
  * The first element in the array is already sorted, so we leave this one alone.
2. For each element we come across, we check if the element is larger than the largest element in the sorted array.
  * If it is larger, then we move on.
  * If it not larger than the largest element in the array, then we move it to the appropriate placew in the sorted array.

