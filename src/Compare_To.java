
public class Compare_To {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Competing MBA";
		String str2 = "Completing Exams";
		String str3 = "Learning Coding";
		int result;
		result = str1.compareTo(str2);
		System.out.println(result);
		result = str2.compareTo(str3);
		System.out.println(result);
		result = str3.compareTo(str1);
		System.out.println(result);
	}

}
