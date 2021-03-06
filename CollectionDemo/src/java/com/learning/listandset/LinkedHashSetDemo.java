
package com.learning.listandset;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedHashSetDemo
{
    public static void main(String[] args)
    {
        Set<String> names = new LinkedHashSet<>();
        names.add("Vani");
        names.add("Ruchit");
        names.add("Karan");
        names.add("Karan");
        names.add("Karan");
        names.add("Mamsi");
        names.add("Himanshu");
        
        // Enhanced For Loop
        for(String name: names)
        {
            System.err.println(name);
        }
        Iterator<String> it = names.iterator();
        
        while(it.hasNext())
        {
        System.out.println(it.next());
        }
    }
}
