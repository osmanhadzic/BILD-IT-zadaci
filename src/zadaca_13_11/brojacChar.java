package zadaca_13_11;

import java.util.Scanner;

public class brojacChar {
	
	public static int brojacKaraktera(String str, char ch) {
		int brojac=0;
		for(int i =0; i<=str.length()-1;++i) {
			if(ch==str.charAt(i)) {
				brojac++;
			}
		}
		return brojac;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Uneste vas tekst: ");
		String str = in.nextLine();
		System.out.print("Uneste krakter: ");
		char ch = in.next().charAt(0); 
		
		int broj = brojacKaraktera(str, ch);
		
		System.out.println("U  tekstu " + str+ " ima " + broj + " kareaktera " + ch );
		
		in.close();

	}

}
