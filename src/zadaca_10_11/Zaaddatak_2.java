package zadaca_10_11;

import java.util.Scanner;

public class Zaaddatak_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Unesite cijeli broj: ");
		
		int duz = in.nextInt();
		System.out.print("Faktori broja: " + duz+" su ");
		for(int i =1;i<=duz;i++) {
			if(duz % i==0)
				System.out.print(i+" ");
		}
		
		in.close();

	}

}
