package objectCusting;

	class Animal{
		int health =100;
	}
	class Cat extends Animal{
	}

public class TestObjectCusting {

	public static void main(String[] args) {
		Animal aml =new Animal();
		Cat c=new Cat();
		aml =c;
		c=(Cat) aml;
		System.out.println(c.health);
	}
}
