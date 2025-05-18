package string;

public class StringBuilder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuilder obj=new StringBuilder("GoodOne");
     obj.replace(2, 5, "yuu");
     System.out.println(obj); //index 2-5 ;chaging 5-2=3char, end value not changing
     
	}

}
