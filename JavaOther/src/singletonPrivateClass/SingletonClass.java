package singletonPrivateClass;

/* private class
 * class extend kora jay na
 * same class e object create kora jay but onno class e object create kora jay na
 * constant er jonno create korte hoy
 * 
 */
public class SingletonClass {
	private static SingletonClass obj = null;

	private SingletonClass() {

	}

	public static SingletonClass getInstantance() {
		if (obj == null) {
			obj = new SingletonClass();
		}
		return obj;
	}

	public void display() {
		System.out.println("singleton class example");
	}

	public static void main(String[] args) {
		SingletonClass obj = SingletonClass.getInstantance();
		// SingletonClass obj2=new SingletonClass();
		obj.display();
	}

}
