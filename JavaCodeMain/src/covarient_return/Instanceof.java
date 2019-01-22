package covarient_return;
class SuperAA {
	int x = 1;
}
class SubBB extends SuperAA {
	int y = 2;
}
class Basee {
	SuperAA getObject() {
		System.out.println("Base");
		return new SuperAA();
	}
}
public class Instanceof extends Basee {
	@Override
	SuperAA getObject() {
		System.out.println("CovariantReturn");
		return new SubBB();
	}
	public static void main(String[] args) {
		Basee test = new Instanceof();
		System.out.println(test.getObject() instanceof SubBB);
		System.out.println(test.getObject().x);
	}
}