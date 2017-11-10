package zadaca_08_11;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
		
		int broj,brojac1=1,sum=0,i=1,brojac2=1;
      
		System.out.print("Unesi nekoliko cijelih brojeva, za prekid unesite 0 : ");
		broj= in.nextInt();
		int max = broj;
		int min = broj;

		        
		while (( broj= in.nextInt()) != 0){
			if(broj>max) {
				max = broj;
				brojac1=0;
			}
			if(broj==max) {
				brojac1++;
			}
			if(broj<min) {
				min = broj;
				brojac2=0;
			}
			if(broj==min) {
				brojac2++;
			}
			sum+=broj;
			i++;
		}
		
		System.out.println("Najveci broj je "+max+" ponavlaja se " + brojac1 + " puta.");
		System.out.println("Najmanji broj je "+min+" ponavlaja se " + brojac2 + " puta.");
		System.out.println("Srednja ocjena je :" +(sum/i)+ " zbir je " + sum);
		in.close();

	}
	

}
