/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist.demo;
import java.util.*;

public class LinkedListsDemo {
    
    public static void main( String[] args ){
        
        LinkedList<Integer> intlist = new LinkedList<>();
       
        int i = 0;
        while( ++i < 10 ) intlist.add(i);
        
        System.out.println("intlist: ");
        System.out.println( "size(): "+intlist.size() );
        System.out.println( intlist.toString() );
        
        System.out.println( "contains(5): "+intlist.contains(5) );
        
        System.out.println( "\nremove( 5 )");
        intlist.remove(5);
        System.out.println( "size(): "+intlist.size() );
        System.out.println( intlist.toString() );
        System.out.println( "contains(5): "+intlist.contains(5) );
        
        System.out.println( "\nremove( new Integer(5) )");
        intlist.remove(new Integer(5));
        System.out.println( "size(): "+intlist.size() );
        System.out.println( intlist.toString() );
        System.out.println( "contains(5): "+intlist.contains(5) );
        
        System.out.println( "\ncontains(\"two\"):\t"+intlist.contains("two") );
        System.out.println( "contains(\"2\"):\t\t"+intlist.contains("2") );
        System.out.println( "contains(2):\t\t"+intlist.contains(2) );
    }
}