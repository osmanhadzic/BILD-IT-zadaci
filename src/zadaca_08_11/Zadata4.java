package zadaca_08_11;

import java.util.Scanner;

public class Zadata4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int k=0;
		
		System.out.println("Unesite cjeli broj: ");
		String br = in.nextLine();
		
		int n = br.length()-1;
		
		int[] niz = new int[n+1];
		
		for (int i =0; i<=n; i++) {
			int j = Character.digit(br.charAt(i), 10);
			niz[k]= j;
			k++;
		}
		
		for(k=0;k<=niz.length-1;k++) {
			int duz = niz.length-1;
			System.out.print(niz[duz-k]);
		}
		
		in.close();
	}

}
