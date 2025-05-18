package exceptionHandling;

public class Exception5 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int age=9;
     
     if(age>=18)
     {
    	 System.out.println("Eligible for voting");
    	 
     }
     else
     {
    	 throw new ArithmeticException("Age below 18");
     }
	}

}
