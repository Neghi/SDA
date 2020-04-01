package ro.unitbv.javadatatype.lab2;

import java.util.Scanner;

public class Exercitiul2 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
        System.out.println("Introdu tipul de drum:");
        
        String drum=scanner.nextLine();
        
        if(drum.equalsIgnoreCase("Oras"))
        {
        	System.out.println("limita 50km");
        }
        else {
       
        if(drum.equalsIgnoreCase("Zona Rezidential"))
        {
        	System.out.println("limita 30km");
        }
        else {
 
        if(drum.equalsIgnoreCase("Drum Express"))
        {
        	System.out.println("limita 100km");
        }
        else {
     
        if(drum.equalsIgnoreCase("Autostrada"))
        {
        	System.out.println("limita 130km");
        }
        else {
        	System.out.println("Drumul nu este cunoscut");
        }
        }}}
        
       
        System.out.println("Introdu tipul de drum2:");
        String drum2=scanner.nextLine();
        String Drum = drum2 ;
        switch (Drum) {
          case "Oras":
            System.out.println("limita 50");
            break;
          case "Zona Rezidentiala":
            System.out.println("limita 30");
            break;
          case "Drum Express":
            System.out.println("limita 100");
            break;
          case "Autostrada":
            System.out.println("limita 130");
            break;
          default:
        	  System.out.println("Drumul nu este cunoscut"); 
        	  
        }
      }
}   
        
        
        
        
        
        
        
        
        
        
        
        
        

