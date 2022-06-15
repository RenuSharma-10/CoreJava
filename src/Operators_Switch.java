import java.util.Scanner;

public class Operators_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter num1, num2-->");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("Enter operator");
		char expr = scan.next().charAt(0);
		switch(expr)
		{
		case '+':
			System.out.println("Adding "+num1+ "and"+num2+":" +(num1+num2));
			break;
		case '-':
			System.out.println("Substracting"+num1+ "and"+num2+ ":" +(num1-num2));
			break;
		case '*':
			System.out.println("Multiplying "+num1+ "and"+num2+":" +(num1*num2));
			break;
		case '/':
			System.out.println("Divding "+num1+ "and"+num2+":" +(num1/num2));
			break;
		case '%':
			System.out.println("Modulo "+num1+ "and"+num2+":" +(num1%num2));
			break;
		default:
			System.out.println("Invalid/Wrong Expression");
			break;
		}
	}

}
