package string;

public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String Original="java";
       StringBuilder obj=new StringBuilder(Original);
       obj.reverse();
       
       if(Original.contentEquals(obj.toString()))
       {
    	   System.out.println("The given String is a Palindrome");  
       }
       else
       {
    	   System.out.println("The given String is not a Palindrome");  
       }
	}

}
