package zadaca_14_11;

import java.util.Scanner;

public class Matrica {
	
	public static void printMatrix(int n) {
		int[][] matrica = new int [n][n];
		
		for(int i =0; i<n;++i) {
			for(int j=0; j<n; j++) {
				matrica[i][j]=(int)(Math.random()*2);
				System.out.printf("matrica[%d][%d] = %d \n", i,j,matrica[i][j]);
			}
		}
		
		
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		System.out.println("Unesite broj kolona i redova za matricu nxn: ");
		
		int broj = in.nextInt();
		
		 printMatrix(broj);
		 
		 in.close();

	}

}
