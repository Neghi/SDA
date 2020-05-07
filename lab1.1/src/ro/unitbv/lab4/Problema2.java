package ro.unitbv.lab4;

import java.util.Scanner;

public class Problema2 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu pozitia :");
		int p = scanner.nextInt();
		int[] sir = new int[10];
		//sir[0]={ 15, 26, 2, 75, 47, 7, 25, 98, 3, 10};
		sir[0]=15;
		sir[1]=26;
		sir[2]=2;
		sir[3]=75;
		sir[4]=47;
		sir[5]=7;
		sir[6]=25;
		sir[7]=98;
		sir[8]=3;
		sir[9]=10;
		int n=sir.length-1;
		for(int i = p ; i <n; i ++)
		{
			sir[i]=sir[i+1];
			
		}
		sir[n]=0;
		System.out.println(java.util.Arrays.toString(sir));
	}

}
