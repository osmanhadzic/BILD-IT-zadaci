package zadaca_08_11;

import java.util.Scanner;

public class Uzorci {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Unesite duzinu uzorka: ");
		
		int duz = in.nextInt();
		
		for(int i=0;i<duz;++i) {
			for(int j=0;j<=i;++j) {
				System.out.print(j + " " );
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		
		for(int i=duz;i>0;--i) {
			for(int j=0;j<i;++j) {
			System.out.print(j + " " );
			}
			
			System.out.println("");
		}
		in.close();

	}

}
