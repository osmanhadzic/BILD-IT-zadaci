package zadaca_08_11;

import java.util.Scanner;

public class Uzorci1 {

public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
		
	int i, j, k;
	
	System.out.println("Unesite duzinu uzorka: ");
	
	int duz = in.nextInt();
	
	for(i=duz;i>=1;i--)
	{
	for(j=duz;j>i;j--)
	{
	System.out.print(" ");
	}
	for(k=1;k<=i;k++)
	{
	System.out.print(k);
	}
	System.out.println();
	}
	}

}
