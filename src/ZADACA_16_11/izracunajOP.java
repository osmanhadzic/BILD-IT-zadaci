package ZADACA_16_11;

import java.util.Scanner;

public class izracunajOP {
	
	public static double obim(double stranica) {
		return stranica*4;
		
	}
	
	public static double povrsina(double stranica) {
		return stranica*stranica;
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesite duzinu stranice kvadrata: ");
		double a = in.nextDouble();
		
		double rezO = obim(a);
		double rezP = povrsina(a);
		
		System.out.println("Obim kvadrata je " + rezO + " povrsina kvadrata "+ rezP);
		
		in.close();

	}

}
