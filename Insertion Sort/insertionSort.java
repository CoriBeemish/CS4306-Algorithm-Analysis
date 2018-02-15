// FILE: insertionSort.java
// AUTHOR: Cori Beemish
// DATE: 02/10/2018
// CLASS: CS4306 Algorithm Analysis

public class insertionSort {
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int entry = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > entry)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = entry;
        }
    }
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int array[] = {3, 7, 4, 9, 5, 2, 6, 1};
        insertionSort temp = new insertionSort();
        temp.sort(array);
        printArray(array);
    }
}
