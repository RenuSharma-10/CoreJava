
public class Increment {
	public static void main(String[] args) {
		int a = 5;
		int b = ++a;
		int c = 10;
		int d = c++;
		int e = a++;
		System.out.println("PreIncrement is=>" + b);
		System.out.println("PostIncrement is=>" + d);
		System.out.println("Print Value c is=>" + c);
		System.out.println("Print Value e is=>" + e);
	}

}
