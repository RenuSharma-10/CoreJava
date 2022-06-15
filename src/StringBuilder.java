
public class StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
	    System.out.println(sb.capacity());
	    StringBuilder sbm = new StringBuilder(" World");
	    System.out.println(sbm.capacity());
	    System.out.println("Insert : "+sbm.insert(0,"Hello"));
	    System.out.println("Delete : "+sbm.delete(6, 11));
	    System.out.println("Append : "+sbm.append("World"));
	    System.out.println("Replace : "+sbm.replace(6, 18,"Renu"));
	    System.out.println("Length : "+sbm.length());
	    System.out.println("Reverse : "+sbm.reverse());
	    System.out.println("charAt :"+sbm.charAt(4));
	    sbm.ensureCapacity(50);
		System.out.println("EnsureCapacity : "+sbm.capacity());
	}

}
