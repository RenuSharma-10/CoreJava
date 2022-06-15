import java.util.Scanner;

public class FibonacciSeries_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number:");
		int i,f=1;
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial is: " +f);
	}

}
