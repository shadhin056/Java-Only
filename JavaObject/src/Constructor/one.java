package Constructor;
public class one {

	public static void main(String[] args) {

		constructor1 obj =new constructor1("rafia");
		constructor1 obj2 =new constructor1("afroze");
		obj.saying();
		obj2.saying();
		obj.setname("rifa");
		obj.saying();
	}

}

 class constructor1 {
		private String girlname ;
		
		public constructor1(String name)
		{
			girlname= name;
		}
		
		public void setname (String name)
		{
			girlname=name;
		}
		public String getname()
		{
			return girlname ;
		}
		public void saying ()
		{
			System.out.printf("your first gf name is %s\n",getname());
		}
		
}
