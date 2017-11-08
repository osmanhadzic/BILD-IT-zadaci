package zadaca_08_11;

import java.util.Scanner;
public class Zadatak1 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		double kamata=0;
		
		System.out.println("Unesite mjesecni iznos uplte i broj mjeseci, godisnja kamata ke 5%");
		double uplata = unos.nextDouble();
		int mjeseci = unos.nextInt();
		
		for(int i=1;i<=mjeseci;i++) {
			kamata= uplata*(1+0.00417);
			uplata=uplata+kamata;
			
		}
		
		System.out.print(kamata);
		unos.close();
 
	}
}
