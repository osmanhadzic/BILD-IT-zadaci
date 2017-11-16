package zadaca_14_11;

import java.util.Date;
import java.util.Scanner;

public class Vrijeme {
	
	public static void datum(int n) {
		Date date = new Date();

	      // display time and date
	      String str = String.format("Tacni datum/vrijeme : %tc", date );

	      System.out.printf(str);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ako zelite tacno vrijeme unesite 1");
		int unos =  in.nextInt();
		switch (unos){
		
		case 1:
			datum(unos);
			break;
			
		default:
			System.out.println("Postoji samo za 1, program se moze jos prosiriti sa dodatnim metodama");
		
		}
		
		
		in.close();

	}

}
