package zadaca_10_11;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Uneste recenicu: ");
		String str = in.nextLine();
		int n = str.length()-1;
		for(int i = 0; i<=n;i++) {
			int pom = n-i;
			System.out.print(str.charAt(pom));
		}
		
		in.close();

	}

}
