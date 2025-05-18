package string;

public class StringMethods {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Malayalam";
		char ch=s.charAt(1);
		//System.out.println(ch);
		//System.out.println(s.concat("subject"));
		//System.out.println(s.contains("yal"));
		
		String a="Hello";
		System.out.println(s.compareTo(a));
		System.out.println(s.length());
		System.out.println(s.equals(a));
		String b="hello";
		System.out.println(a.equalsIgnoreCase(a));
		System.out.println(b.toUpperCase());
		System.out.println(a.toLowerCase());
		
		
	

	}

}
