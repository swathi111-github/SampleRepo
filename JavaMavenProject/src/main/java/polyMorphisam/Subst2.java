package polyMorphisam;

public class Subst2 extends Subst1{
	public void sub()
	{
		float a=10.1f;
		float b=8.1f;
		float c=a-b;
		System.out.println(c);
		
		super.sub();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subst2 obj=new Subst2();
		obj.sub();

	}

}
