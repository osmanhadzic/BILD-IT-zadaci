package zadaca_13_11;

import java.util.Scanner;

public class duzinaStringa {
	public static int prebrojiSlova(String s) {
		return s.length();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Uneste rijec: " );
		String str = in.nextLine();
		
		int duz = prebrojiSlova(str);
		
		System.out.print("String ima " + duz);
		
		in.close();

	}

}
