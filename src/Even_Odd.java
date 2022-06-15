import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number :");
		int a=sc.nextInt();
		//System.out.println("Enter Num b:");
		//int b=sc.nextInt();
		if (a%2 == 0)
		{
			System.out.println(a+ "--> It is even");
		}
		else
		{
			System.out.println(a+ "--> It is odd");
		}
	}

}
