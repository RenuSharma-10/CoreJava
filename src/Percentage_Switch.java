import java.util.Scanner;

public class Percentage_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("All Sub Marks");
		System.out.println("Sub_1 Marks");
		Scanner scan;
		int sub_1  =  scan.nextInt();
		System.out.println("Sub_2 Marks");
		int sub_2 =  scan.nextInt();
		System.out.println("Sub_3 Marks");
		int sub_3  =  scan.nextInt();
		int avg=(sub_1 marks + sub_2 marks+ sub_3 marks)/3;
		System.out.println("Percentage is:"+avg);
		int avg = average/10;
		switch(avg)
		{
		case 9:
			System.out.println("O Grade");
			break;
		case 8:
			System.out.println("A Grade");
			break;
		case 7:
			System.out.println("B Grade");
			break;
		case 6:
			System.out.println("C Grade");
			break;
		case 5:
			System.out.println("D Grade");
			break;
		default:
			System.out.print("Fail");
			break;
	}
	}
}
