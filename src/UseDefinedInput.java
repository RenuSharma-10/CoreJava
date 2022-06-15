import java.util.Scanner;

public class UseDefinedInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = scan.nextLine();
		System.out.println("Enter Age");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter City");
		String city = scan.nextLine();
		System.out.println("Enter Percentage");
		Double per = scan.nextDouble();
		System.out.println("Name-->" + name);
		System.out.println("Age-->" + age);
		System.out.println("City-->" + city);
		System.out.println("Percentage-->" + per);
	}

}
