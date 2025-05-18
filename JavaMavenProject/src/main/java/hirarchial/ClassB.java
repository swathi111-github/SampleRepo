package hirarchial;

public class ClassB extends ClassA{
	public void hira2()
	{
		System.out.println("This is Class B");
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB obj=new ClassB();
		obj.hira1();
		obj.hira2();
	}

}
