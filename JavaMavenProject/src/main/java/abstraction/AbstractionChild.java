package abstraction;

public class AbstractionChild extends AbstractionParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   AbstractionChild obj=new AbstractionChild();
    obj.display();
    obj.show();
    obj.random();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("abstract");
	}

	public void random()
	{
		System.out.println("Welcome");
	}
}
