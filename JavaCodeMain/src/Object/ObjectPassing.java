package Object;

public class ObjectPassing {
	static int a=10;
	public void exdata(ObjectPassing obj)
	{
		obj.a=200;
	}
	public static void main(String[] args) {
		System.out.println(a);
		ObjectPassing obj=new ObjectPassing();
		obj.exdata(obj);
		System.out.println("change of a is here : ");
		System.out.println(a);
	}

}
