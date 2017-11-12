package zadaca_10_11;

public class Zadatak_1 {

	public static void main(String[] args) {
		int n, b, sum = 0;
        System.out.print("Armstrong brojevi od 1 do 1000:");
        for(int i = 1; i <= 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
	}

}
