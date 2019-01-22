package Generic;

public class GenericClassDemo<T> {
	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		GenericClassDemo<Integer> obj = new GenericClassDemo();
		GenericClassDemo<String> obj2 = new GenericClassDemo();
		obj.add(new Integer(10));
		obj2.add(new String("ami"));

		System.out.println(obj.get());
		System.out.println(obj2.get());

	}

}
