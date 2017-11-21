package ZADACA_16_11;

import java.util.Scanner;

public class Kviz {
	
	public static void pitanja(int br) {
		Scanner in = new Scanner(System.in);
		int brojacT=0,brojacN=0;
		for(int i=1;i<=br;++i) {
			System.out.println("Izracunj sledeci zadatak: ");
			int num1 = randombr1();
			int num2 = randombr2();
			System.out.print(num1+" - "+num2+" = ");
			int rez = in.nextInt();
			boolean odg = resenje(num1,num2,rez);
			if(odg) {
				brojacT++;
			}else {
				brojacN++;
				}
			
		}
		System.out.print("Broj tacnih odg je "+brojacT+" a netacnih je "+brojacN);
			in.close();    		
	}
	
	public static boolean resenje(int br1, int br2, int rez) {
		int tacno = br1 - br2;
		if(tacno == rez)
			return true;
		else
			return false;
		
	}
	
	public static int randombr1() {
		return 5+(int)(Math.random()*(10-5));
	}
    public static int randombr2() {
		return (int)(Math.random()*5);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unesite broj pitanja: ");
		int brpitanja = in.nextInt();
		
		pitanja(brpitanja);
		
		in.close();

	}

}
