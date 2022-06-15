import java.util.Scanner;

public class Factorial_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int i=1;
		int fact =1;
		int num = scan.nextInt();
		while(i<= num)
		{
			fact= fact*i;
			i++;
		}
		System.out.println("Factorial of " +num+ " 5is: " +fact);
	}

}
