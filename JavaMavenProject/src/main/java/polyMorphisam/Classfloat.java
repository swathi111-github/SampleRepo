package polyMorphisam;

public class Classfloat extends ClassInt {
          public  void add()
            {
            	float a=55.5f;
            	float b=77.8f;
            	float c=a+b;
            	System.out.println(c);
            	
            	super.add();
            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Classfloat obj=new Classfloat();
       obj.add();
       
	}

}
