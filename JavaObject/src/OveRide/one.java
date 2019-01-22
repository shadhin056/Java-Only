package OveRide;
public class one {

	public static void main(String[] args) {
			Aquatic ob = new Aquatic();
			System.out.println("produce by derived class "+ob.fun(2, 3));
	}
}
 class Animal {
	int fun (int a,int b)
	{
		int sum =a+b;
		return sum;
	}
}

 class Aquatic extends Animal {
	@Override
	int fun (int a,int b)
	{	System.out.println("sum by super class : "+super.fun(a, b));
		int c= a*b;
		return c;
	}
}
