package Polymorphism;

public class one {

	public static void main(String[] args) {

		Cc [] thelist = new Cc[2];
		Aa objA = new Aa();
		bB objB = new bB();
		thelist [0]=objA;
		thelist [1]=objB;
		for(int i=0;i<thelist.length;i++ )
		{
			thelist[i].noise();
		}
	}
}

 class Cc {

	public void noise() {
	}
}

 class bB extends Cc {
	public void noise ()
	{
		System.out.println("animal B ");
	}
}


 class Aa extends bB{
	public void noise ()
	{
		System.out.println("animal AAA");
	}
}
