package ro.unitbv.javadatatype.lab2;

import java.util.ArrayList;
import java.util.Collections;

public class Exercitiul3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> temperatura = new ArrayList<Integer>();
	    temperatura.add(20);
	    temperatura.add(30);
	    temperatura.add(35);
	    temperatura.add(37);
	    temperatura.add(38);
	    temperatura.add(36);
	    temperatura.add(40);
	   // temperatura.add(37.1);
	   // temperatura.add(37.5);
	    //temperatura.add(36.9);
	    Collections.sort(temperatura);  
	    System.out.println(temperatura);
	    
	    
	    System.out.println("temperaturi normale:");
	    for (int i : temperatura) {
	        if(i<=37) {
	        	   System.out.println(i);
	        } 
	  }
	    System.out.println("temperaturi anormale:");
	    for (int i : temperatura) {
	        if(i>37) {
	        	   System.out.println(i);
	        } 
	  }
	    
}
}


