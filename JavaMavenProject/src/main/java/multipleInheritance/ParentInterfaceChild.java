package multipleInheritance;

public class ParentInterfaceChild implements Parentinterface1,Parentinterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentInterfaceChild obj =new ParentInterfaceChild();
		obj.print();
		obj.task();
		obj.display();
		obj.show();
		obj.random();

	}
	

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hai");
	}

	@Override
	public void task() {
		// TODO Auto-generated method stub
		System.out.println("Swathi");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Please");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Join");
		
	}
	
	public void random() {
		// TODO Auto-generated method stub
		System.out.println("fast");
		
	}

}
