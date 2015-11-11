/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortcompare;

import java.util.Random;

/**
 *
 * @author Jonathan
 */
public class SortCompare 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         Random gen=new Random(); 
         int[] a=new int[32];
      
      int i;
      for (i=0; i < a.length; i++) 
      {
          a[i]=gen.nextInt(5000)+1;
      }
      
      System.out.println("Initial array:");
      System.out.println(a);

        insertionSort ins = new insertionSort(a);
        int count = ins.getCount();
        System.out.println(count);
    }
    
}
