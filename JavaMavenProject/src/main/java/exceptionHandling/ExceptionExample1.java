package exceptionHandling;

public class ExceptionExample1 {
	
	public static void main (String args[])
	{
		int a=10;
		int b=0;
	try
	{
		int c=a/b;
	System.out.println(c);
	}
	/*catch(ArithmeticException m)
	{
	    b=5;
	   int c=a/b;
	   System.out.println(c);
	   System.out.println(m);
	}*/
	
	finally
	{
		System.out.println("Execution Completed");
	}
		
	}

}


