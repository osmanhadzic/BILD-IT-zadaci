package zadaca_13_11;

import java.util.Scanner;

public class prostiBroj {
	 public static boolean isProstiBroj(int broj) {
		 int i=2;
		 while(i<= broj/2)
		 {
		    if(broj % i == 0)
		    {
		 	return false;
		 	
		    }
		    i++;
		 }
		 return true;
	 }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int num=0;
		
		
		System.out.println("Unesite broj koji zelte da ispitate(od 0 d0 100 000)");
		int broj = in.nextInt();
		
		boolean iskaz = isProstiBroj(broj);
		
		if(iskaz) {
			
		System.out.println("Broj " + broj +" je prosti:");
			
		for(int i =1;i<=100000 ;++i) {
			int brojac=0;
			
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					brojac=brojac+1;
				}
			}
			
			if(brojac==2) {
				
				System.out.println(i);
				
			}
			
		}	
		
		

	}else {
		System.out.println("Broj nije prosti: ");
	}
		in.close();
	}
	}


