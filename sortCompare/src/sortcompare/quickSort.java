/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortcompare;

/**
 *
 * @author Jonathan
 */
public class quickSort
{
private int count;

public quickSort(int a[])
{
    count = 0;
}

public void quickSort(int[] a, int startIndex, int endIndex) 
     {
        int pivotIndex;      // the index of pivot returned by the quicksort partition

        // if the set has more than one element, then partition
        if (startIndex < endIndex) 
        {
            // partition and return the pivotIndex
            pivotIndex = partition(a, startIndex, endIndex);
            // quicksort the low set
            quickSort(a, startIndex, pivotIndex - 1);
            // quiclsort the high set
            quickSort(a, pivotIndex + 1, endIndex);
        } // end if
    } // end quickSort()
    //************************************************************************

    // This method performs quicksort partitioning on a set of elements in an array.
    private int partition(int[] a, int startIndex, int endIndex) 
    {

        int pivotIndex;             // the index of the chosen pivot element
        int pivot;                  // the value of the chosen pivot
        int midIndex = startIndex;  // boundary element between high and low sets

        // select the center element in the set as the pivot by integer averaging
        pivotIndex = (startIndex + endIndex) / 2;
        pivot = a[pivotIndex];

        // put the pivot at the end of the set so it is out of the way
        swap(a, pivotIndex, endIndex);

        // iterate the set, up to but not including last element
        for (int i = startIndex; i < endIndex; i++) 
        {
            // if a[i] is less than the pivot
            if (a[i] < pivot) 
            {

                // put a[i] in the low half and increment current Index
                swap(a, i, midIndex);
                midIndex = midIndex + 1;
                count ++;
            } // end if
        } // end for 
        
        // partitioning complete -- move pivot from end to middle
        swap(a, midIndex, endIndex);

        // return index of pivot
        return midIndex;
        
    } // end partition
    //************************************************************************

    // This method swaps two elements in an integer array
    private void swap(int[] a, int first, int second) 
    {
        
        int c;  // a catalyst variable used for the swap

        c = a[first];
        a[first] = a[second];
        a[second] = c;
        

    } // end Swap()
    //************************************************************************

public int getCount()
{
    return count;
}
}
