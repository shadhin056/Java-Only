package Interface;
	
 interface Animal{
	public abstract void eat();
	public static final int x = 100;
}
 interface jungle extends Animal{
		public abstract void eat();
	}

 interface wild extends Animal,jungle{
		public abstract void eat();
	}
 

public class Basic implements Animal,jungle{

	public static void main(String[] args) {
		System.out.println(x);
	}
	@Override
	public void eat() {
		System.out.println(x);
		
	}

}
