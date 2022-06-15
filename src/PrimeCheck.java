import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number to check ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(+n+ " is prime number");
		}
		else
		{
			System.out.println(+n+ " is not a prime number");
		}
	}

}
