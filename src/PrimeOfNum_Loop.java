import java.util.Scanner;

public class PrimeOfNum_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime Number upto n");
		System.out.println("Enter n value");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(+i+ " ");
			}
		}
	}

}
