package inheritance;

public class ClassC extends ClassB {
	
	public static void multi3()
	{
	System.out.println("Class C");
	}

	public static void main(String[] args) {
		ClassC obj=new ClassC();
		obj.multi1();
		obj.multi2();
		obj.multi3();
		// TODO Auto-generated method stub

	}

}
