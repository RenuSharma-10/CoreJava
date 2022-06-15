import java.util.Scanner;

public class PercentageUsingLadder {

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
		float avg=(sub_1 marks + sub_2 marks+ sub_3 marks)/3;
		System.out.println("Percentage is:"+avg);
		if(avg>=95)
		{
			System.out.println("O Grade");
		}
		else if (avg<95 && avg>=85)
		{
			System.out.println("A Grade");
		}
		else if (avg<85 && avg>=70)
		{
			System.out.println("B Grade");
		}
		else if (avg<70 && avg>=55)
		{
			System.out.println("C Grade");
		}
		else if (avg<55 && avg>=40)
		{
			System.out.println("D Grade");
		}
		else
		{
			System.out.print("Fail");
		}
	}

}
