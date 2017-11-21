package ZADACA_16_11;

import java.util.Scanner;

public class Zadaca21_1 {
	
	public static String format(int number, int width) {
		String str = Integer.toString(number);
		int wstr = str.length();
		int pom = width - wstr;
		for (int i =0;i<pom;++i) {
			str = 0 + str ;
		}
		
		return str;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		int broj = in.nextInt();
		
		System.out.print("Unesite duzinu formata: ");
		
		int duz = in.nextInt();
		
		String rez = format(broj,duz);
		
		System.out.println(rez);
		
		in.close();

	}

}
