package Constructor;

class abc{	
	private String name;
	private int code;
	public abc()
	{	
		System.out.println("Constructor 1");
	}
	//..............................
	public abc(String name)
	{
		System.out.println("Constructor 2");
		this.name ="Rafia";
		System.out.println(name);
		System.out.println(this.name);
	}
	//..............................
	public abc(String name,int code)
	{
		System.out.println("Constructor 3");
		name ="Rafia";
		//code=14;
		System.out.println(name+" "+code);
	}
	//..............................
}
public class Three {
	public static void main(String[] args) {
		abc obj = new abc();
		abc obj1 = new abc("Rafia 007");
		abc obj2 = new abc("Rafia  = ", 12);
	}
}
