
## Binary Search

Binary search is a search algorithm that finds the position of a target element within a sorted array. It is *very* important that the array is already sorted before we use binary search. Binary search uses a "pivot", an the target element in the array, to compare to the other elements in the array.

**Best-case performance:** O(1)
**Worse-case performance:** O(log *n*)
**Average:** O(log *n*)

**Steps**
1. Compare the pivot to the middle element of the array.
2. If the pivot is the middle element of the array, then we return the mid index and we're done!
3. If the pivot is greater than the middle element, then we start searching in the sub-array to the right of the middle element.
4. If the pivot is smaller than the middle element, then we start searching to the left.
5. We repeat this process from step 2, until we find our desired element and return it's position. 
