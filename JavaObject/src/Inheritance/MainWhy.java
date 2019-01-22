package Inheritance;
class Employee{
		public String name;
		public int id;
		
		public Employee() {
			this.name = "Rahim";
			this.id = 2;
		}

		public Employee(String name, int id) {
			super();
			this.name = name;
			this.id = id;
		}
		 String getdetails()
		{
			return "ID is "+id+ "Name is "+name;
		}
	}
class Manager extends Employee
{
	public String department;
	public Manager (int id,String name ,String department)
	{
		super(name,id);
		this.department=department;
	}	
	@Override
	 String getdetails()
	{
		return "subdetails";
	}
	void print()
	{
		System.out.println("Name       :"+ name);
		System.out.println("Department :"+department);
		System.out.println("Id         :"+id);
	}
}

public class MainWhy {

	public static void main(String[] args) {
		Manager mgr=new Manager(1, "Karim", "cse");
		mgr.print();
		Employee e=new Manager(1,"jamil","cse");
		System.out.println(mgr.getdetails());
	}
	
}	
	

