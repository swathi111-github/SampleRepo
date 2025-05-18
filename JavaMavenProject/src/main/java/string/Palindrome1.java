package string;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String Original ="Malayalam";
       //Original=Original.toLowerCase();
       StringBuilder obj=new StringBuilder(Original);
       obj.reverse();
       
       
       if(Original.equalsIgnoreCase(obj.toString()))
       {
    	   System.out.println("The given String is a Palindrome");   
       }
       else
       {
    	   System.out.println("The given String is not a Palindrome"); 
      
	}
	}

}


