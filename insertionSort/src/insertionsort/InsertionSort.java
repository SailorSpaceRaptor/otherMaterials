/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author Jonathan
 */
public class InsertionSort 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    for (int k = 1; k<= 100; k++)
        {
        int size = 100;     // change this number to change the size of the random array
        int[] a = new int[size];
        int[] temp = new int[a.length];  // empty temporary array, the same size and type as a[]

        // fill the array with random integers
        for (int i = 0; i< a.length; i++) 
            a[i] = (int)(Math.random()*100000 +1);
        insertionSort(a);
    }
    }
    
    public static int[] insertionSort(int [] a)
{
  int value;
  int i;
  int j;
  int compare = 0;
        
        for (i = 1; i < a.length; i++) 
        {
            value = a[i];
            // find the insertion location while moving all larger element up
           j = i;
           
            while (j > 0 && a[j - 1] > value) 
            {
                a[j] = a[j - 1];
                j--;
            }
            // insert the element
            
            a[j] = value;
                
        }
     
        System.out.println(compare);
        return a;
        
    }
    }
    
