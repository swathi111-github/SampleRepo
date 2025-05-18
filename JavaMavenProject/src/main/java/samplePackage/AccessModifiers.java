package samplePackage;

public class AccessModifiers {

	
		public void display()
		{
			System.out.println("This is public");
		}
		private static void display2()
		{
			System.out.println("This is private");
		}
		protected void display3()
		{
			System.out.println("This is protected");
		}
		void display4()
		{
			System.out.println("This is default");
		}
		
		public static void main(String[] args) {
			AccessModifiers.display2();
		}

	

}
