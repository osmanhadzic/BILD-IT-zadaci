package zadaca_10_11;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		char a=0,b=0;
		System.out.println("Unesite vsu rijec: ");
		String str = in.nextLine();
		int duz = str.length()-1;
		for(int i =0 ; i<duz ;++i) {
			for(int j=0; j<duz; ++j) {
				if(i!=j) {
					 a = str.charAt(i);
					 b = str.charAt(j);
					if(a!=b);
					break;
				}
					
			}
			
		}
		System.out.print("Prvi karakter koji se ne pojavljuje u ostatku stringa je: "+a);
		
		in.close();
	}

}
