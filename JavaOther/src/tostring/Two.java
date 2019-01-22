package tostring;
public  class Two {
	private int id;
	private String name;

	public Two() {
	}
	public Two(int id, String name) {
		// super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{ID  "+id+name+"}";
	}
//........................................................
		public static void main(String[] args) {
			String data = "Hello";
			System.out.println(data);
			Two employe= new Two(12,"SHADHI");
			System.out.println(employe.toString());
	}
}
