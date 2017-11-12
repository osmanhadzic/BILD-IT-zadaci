package zadaca_10_11;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Unesite ASCII broj: ");
		int slovo = in.nextInt();
		if(slovo >= 0 && slovo <= 127)
		System.out.println("ASCII vrijednos " + slovo + " je " + (char)slovo);
		in.close();

	}

}
