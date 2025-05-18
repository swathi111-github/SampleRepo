package string;

public class StringBuilder4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuilder obj=new StringBuilder("Hai");
     obj.append(" Swathi");//Java automatically calls .toString() on the StringBuilder behind the scenes, so it prints the string content inside the StringBuilder.


     System.out.println(obj);
     
	}

}
