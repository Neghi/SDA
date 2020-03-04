package ro.unitbv.javadatatype;

import java.util.Scanner;

public class Exercitiu1 {

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		
		//afisam mesajul in  consola
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduc nr 1:");
		int nr1= scanner.nextInt();
		
		System.out.println("Introduc nr 2:");
		int nr2=scanner.nextInt();
		
		
		// afisam output-ul
		System.out.println("nr citit este:"+nr1);
		System.out.println("nr citit este:"+nr2);
		
		//CERINTE
		System.out.println("SUMA:"+(nr1+nr2));
		System.out.println("PRODUSUL:"+(nr1*nr2));
		System.out.println("DIFERINTA:"+(nr1-nr2));
		System.out.println("MEDIA:"+((nr1-nr2)/2));
		
		if(nr1>nr2) {
		System.out.println("DISTANTA:"+(nr1-nr2));
		}else {
			System.out.println("DISTANTA:"+(nr2-nr1));
		}
		
		if(nr1>nr2) {
			System.out.println("Cel mai mare nr. este:"+nr1);
			}else {
				System.out.println("Cel mai mare nr. este:"+nr2);
			}		
		
		double impartire = (double)nr1/nr2;
		int impartire2 = nr1/nr2;
		System.out.println("Impartire:"+impartire);
		System.out.println("Impartire:"+impartire2);
	}

}
