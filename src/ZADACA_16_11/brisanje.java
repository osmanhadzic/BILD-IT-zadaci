package ZADACA_16_11;

import java.util.Scanner;

public class brisanje {
	
	public static String  obrisiZnak(char ch,String str) {
		String pom ="";
          for(int i =0; i<str.length();i++) {
			
			if(str.charAt(i)!=ch) {
				pom = pom + str.charAt(i);
				
			}
			
		}
          return pom;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unesite strin i znak koji zelite da obrisete : " );
		
		String str = in.nextLine();
		char ch = in.next().charAt(0);
		
		String obrisan = obrisiZnak(ch, str);
		
		System.out.print(obrisan);
		
		in.close();

	}

}
