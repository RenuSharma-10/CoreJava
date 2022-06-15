import java.util.Scanner;

public class MenuDrivenOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		int choice;
		while(true)
		{
			System.out.println("1. Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Quit\n\n");
			
			System.out.print("Enter your Choice: ");
			choice=sc.nextInt();
			
			switch (choice)
			{
			case 1:
				System.out.print("Enter Number a: ");
				a=sc.nextInt();
				System.out.print("Enter Number b: ");
				b=sc.nextInt();
				c=a+b;
				System.out.print("Sum =" +c+ "\n");
				break;
			
			case 2:
				System.out.print("Enter Number a: ");
				a=sc.nextInt();
				System.out.print("Enter Number b: ");
				b=sc.nextInt();
				c=a-b;
				System.out.print("Sub =" +c+ "\n");
				break;
				
			case 3:
				System.out.print("Enter Number a: ");
				a=sc.nextInt();
				System.out.print("Enter Number b: ");
				b=sc.nextInt();
				c=a*b;
				System.out.print("Mul =" +c+ "\n");
				break;
				
			case 4:
				System.out.print("Enter Number a: ");
				a=sc.nextInt();
				System.out.print("Enter Number b: ");
				b=sc.nextInt();
				c=a/b;
				System.out.print("Div =" +c+ "\n");
				break;
				
			case 5:
				System.exit(0);
				
			default:
				System.out.println("Invalid/ Out of Loop. ");					
			}
		}
	}

}
