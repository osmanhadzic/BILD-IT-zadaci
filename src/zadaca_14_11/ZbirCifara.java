package zadaca_14_11;

import java.util.Scanner;

public class ZbirCifara {
	
	public static int saberiCifre(String br ) {
		int sum=0;
		for(int i = 0; i < br.length(); i++) {
		    int j = Character.digit(br.charAt(i), 10);
		    sum = sum + j;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		String br = in.nextLine();
		
		int rez =  saberiCifre(br );
		
		System.out.print("Zbir cifara broja " + br + " je " + rez);

		in.close();
	}

}
