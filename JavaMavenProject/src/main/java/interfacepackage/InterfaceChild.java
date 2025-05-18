package interfacepackage;

public class InterfaceChild implements Sampleinterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild obj=new InterfaceChild();
		obj.show();
		obj.display();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}
   public void display()
   {
	   System.out.println("World");
   }
}
