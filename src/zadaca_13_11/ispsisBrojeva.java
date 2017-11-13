package zadaca_13_11;

import java.util.Scanner;

public class ispsisBrojeva {
	public static void ispisiSortiraneBrojeve(double broj1, double broj2, double broj3) {
		if(broj1 > broj2) {double c =broj1; broj1 = broj2 ; broj2=c;}
		if(broj1 > broj3) {double c =broj1; broj1 = broj3 ; broj3=c;}
		if(broj2 > broj3) {double c =broj2; broj2 = broj3 ; broj3=c;}
		
		System.out.println(broj1 +" "+ broj2+ " "+ broj3);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unesite tri broja: ");
		
		double br1= in.nextDouble();
		double br2= in.nextDouble();
		double br3= in.nextDouble();
		
		ispisiSortiraneBrojeve(br1,br2,br3);
		
		in.close();

	}

}
