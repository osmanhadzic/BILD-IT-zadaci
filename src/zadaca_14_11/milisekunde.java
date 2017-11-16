package zadaca_14_11;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class milisekunde {
	public static String pretvoriMilisekunde(long millis) {
		long second = TimeUnit.MILLISECONDS.toSeconds(millis);
		long minute = TimeUnit.MILLISECONDS.toMinutes(millis);
		long hour = TimeUnit.MILLISECONDS.toHours(millis);
		millis -= TimeUnit.SECONDS.toMillis(second);
		return String.format("%02d:%02d:%02d:%d", hour, minute, second, millis);
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unesite iznos milisekundi: ");
		
		long unos = in.nextLong();
		
		String rez = pretvoriMilisekunde(unos);
		
		System.out.print(rez);
		
		in.close();

	}

}
