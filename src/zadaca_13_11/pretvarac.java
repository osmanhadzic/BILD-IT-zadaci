package zadaca_13_11;

import java.util.Scanner;

public class pretvarac {
	 public static double stopeUMetre(double stope) {
		 return stope*0.305;
	 }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Uneste duzinu u stopama: ");
		double stopa = in.nextDouble();
		
		System.out.printf("%f", stopeUMetre(stopa));
		
		in.close();

	}

}
