package Method;

	public class MethodOne {
		
		int x,y;
		double d;
		String s;
		
		 int display(int x,int y)
		{
			return x+y;
		}
		 void Set(int x,int y)
		 {
			 this.x = x;
			 this.y = y;
		 }
		
	public static void main(String[] args) {
		
		MethodOne obj =new MethodOne();
		obj.Set(50,50);
		
		int s = obj.display(50, 60);
		
		System.out.println(s);
	}

}
