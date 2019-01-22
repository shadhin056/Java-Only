package Method;


public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ami obj = new ami("shadhin");
		ami obj2 = new ami("shadhin2");
		//obj.setname("fun");
		obj.saying();
		obj2.saying();
		
	}

}
 class ami {
	String name2;
	public ami (String name)
	 {
		 name2=name;
	 }
//	public void  setname(String name)
//	{
//		name2 = name;
//	}
	public String  getname ()
	{
		return name2;
	}
	public void saying ()
	{
		System.out.println(getname());
	}
}
