package zadaca_14_11;

import java.util.Random;

public class Nasumicni {
	
	public static char znak(int i) {
         Random random = new Random();
         
		 return (char)(random.nextInt(26)+65);

				
	}
	
	public static int broj(int k) {
		
		return (int)(Math.random()*10);
	}
	

	public static void main(String[] args) {
		int j=1;
		for(int i=1;i<=100;++i,++j) {
			System.out.printf("%c", znak(i));
			if(j==10) {
				System.out.println("");
				j=0;
			}
		
		}
		
		System.out.println("");
		System.out.println("");
		
		for(int k=1; k<=100;k++,++j) {
			System.out.printf("%d", broj(k));
			if(j==10) {
				System.out.println("");
				j=0;
			}
		}

	}

}
