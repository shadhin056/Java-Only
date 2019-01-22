package nestedClass;
abstract class person{
	abstract void eat();// default e not abstract
}
public class AnnomynousNonStaticAbs {
	public static void main(String[] args) {
		person p=new person() {
			
			@Override
			void eat() {
				
			}
		};
	}
}
