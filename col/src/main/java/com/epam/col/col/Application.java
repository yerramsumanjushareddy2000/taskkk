package com.epam.col.col;
import java.util.*;
public class Application {
	    public static void main(String[] args) {
	       List<Integer> l = new ArrayList<Integer>(10);
	       l.add(0,1);
	       l.add(1,4);
	       l.add(2,6);
	       System.out.println(l);
	       l.remove(2);
	       l.add(2,9);
	       System.out.println(l.get(2));
	       System.out.println(l.indexOf(4));
	       l.set(0,9);
	       if (l.isEmpty())
	       {
	    	   System.out.println("List is empty");
	       }
	       else
	       {
	    	   System.out.println("List is not empty");
	       }
	       l.clear();  
	    }
	}

