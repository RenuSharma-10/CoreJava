import java.util.Scanner;

public class MaxOf2Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a,b,c:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a > b && a > c) {
			System.out.println(a + "is greater");
		} else if (b > a && b > c) {
			System.out.println(b + "is greater");
		} else {
			System.out.println(c + "is greater");
		}
	}

}
