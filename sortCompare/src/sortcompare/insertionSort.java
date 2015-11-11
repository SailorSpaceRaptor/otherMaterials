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
public class insertionSort 
{
   private int count;
   
   public insertionSort(int [] a)
   {
       count = 0;
   }
    
    
    public int[] insertionSort(int [] a)
{
  int value;
  int i;
  int j;
        
        for (i = 1; i < a.length; i++) 
        {
            value = a[i];
            // find the insertion location while moving all larger element up
           j = i;
           
            while (j > 0 && a[j - 1] > value) 
            {
                a[j] = a[j - 1];
                j--;
                count ++;
            }
            // insert the element
            
            a[j] = value;
                
        }
     
        
        return a;
        
    }
    
    //this method returns the number of comparisons 
    public int getCount()
    {
        return count;
    }
    
}
