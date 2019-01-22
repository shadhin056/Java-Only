package Static;
public class nonStatic {
	public static void main(String[] args) {
		subC objC=new subC();
		System.out.println(objC.id);
		subC objC2=new subC();
		System.out.println(objC2.id);
	}
}

 class subC {
	int id=0;
	public subC() {
		id++;
	}
}
