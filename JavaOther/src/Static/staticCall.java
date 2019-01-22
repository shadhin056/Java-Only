package Static;
public class staticCall {
	public static void main(String[] args) {
		//int x=subC.id;
		subCCC objC=new subCCC();
		subCCC objcC=new subCCC();
	}
}

 class subCCC {
	static int id;
	static {
		id=0;
		System.out.println("static block");
	}
	static {
	
		System.out.println("static block 2nd");
	}
	public subCCC() {
		id++;
		System.out.println("Constructor "+id);
	}
}