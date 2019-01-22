package Static;

public class Call {

	public static void main(String[] args) {
		subbC objC=new subbC();
		System.out.println(objC.id);
		subbC objC2=new subbC();
		System.out.println(objC2.id);
	}
}

  class subbC {
	static int id=0;
	public subbC() {
		id++;
	}
}
