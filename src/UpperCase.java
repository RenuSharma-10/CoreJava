package corejava;

import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter String_1"); //String1
		 String s1= scan.nextLine();
		 System.out.println("Enter String_2"); //String2
		 String s2= scan.nextLine();
		 System.out.println(s1+""+s2);
		 String s=s1+s2;
		 //String length
		 System.out.println("Length of a String:"+s.length());
		 //String UpperCase
		 System.out.println("UpperCase:"+s.toUpperCase());
		 //String LowerCase
		 System.out.println("LowerCase:"+s.toLowerCase());
	}

}
