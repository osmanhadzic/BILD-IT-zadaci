package zadaca_15_11;

public class Twin {

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
		for(int i=2;i<=num/2;i++)
		{
	           int temp = num%i;
		   if(temp==0)
		   {
		      return 0;
		      
		   }
		}
		return num;
	}

	public static void main(String[] args) {
		int[] broj = prostiBroj();
		int pbr;
		int j=1;
		for(int i=0; i<broj.length-1;++i,j++) { 
		pbr = palindrom(broj[i]+2);
		if(i>=4) {
			if(pbr!=0)
		System.out.print(broj[i]+" "+pbr+" ");
		}
		if(j==10){
			System.out.println("");
			j=0;
		}
		}
		
		

	}

}
