package OveRide;

 class A {
	
		int w=10;
		public void printinfo()
		{
			System.out.println("super class  "+w);
		}
}

public class two extends A{
public static void main(String[] args) {
two obj = new two();
}	
public two()
{
	printinfo();
}
	@Override
		public void printinfo() {
			super.printinfo();
			System.out.println("HI");
		}
}
