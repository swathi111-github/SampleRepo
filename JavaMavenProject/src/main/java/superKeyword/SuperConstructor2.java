package superKeyword;

public class SuperConstructor2 extends SuperConstructor1
  {
	public SuperConstructor2(String a)
	{
		super("Swathi");
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperConstructor2 obj=new SuperConstructor2("123");
	}

}
