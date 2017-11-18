package zadaca_15_11;

public class palindromProstog {
	
	public static int[] prostiBroj() {
		
		int niz[] = new int[25];
		int num=0,j=0;
		
		for(int i =1;i<=100;++i) {
			int brojac=0;
			
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					brojac=brojac+1;
				}
			}
			
			if(brojac==2) {
				
				niz[j]=i;
				j++;
			}
		}	
			return niz;
	}
	
	public static int palindrom(int num) {
		int reverse=0;
		if(num>=10) {
		while( num != 0 )
	      {
			reverse = reverse * 10;
			reverse = reverse + num%10;
	          num = num/10;
	      }
		}
		return reverse;
	}

	public static void main(String[] args) {
		int[] broj = prostiBroj();
		int pbr;
		int j=1;
		for(int i=0; i<broj.length-1;++i,j++) { 
		pbr = palindrom(broj[i]);
		if(i>=4) {
		System.out.print(broj[i]+" "+pbr+" ");
		}
		if(j==10){
			System.out.println("");
			j=0;
		}
		}
		
		

	}

}
