package Static;

public class NormalandStatic {

	public static void main(String[] args) {
		person objPerson=new person();
		objPerson.staticmethod();
	}
}
class person {
	int normalvariable=1;
	static int staticvariable=5;
	
	public void Normalmethod() {
		System.out.println("NORMAL");
	}
	public static void staticmethod() {
		person obj=new person();
			System.out.println(staticvariable);
			System.out.println(obj.normalvariable);
			obj.Normalmethod();
	}
}