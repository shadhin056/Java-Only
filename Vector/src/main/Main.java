package main;
import java.util.Enumeration;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector v=new Vector(2,3);
		System.out.println("Initial size : "+v.size());
		System.out.println("initial Capasity : "+v.capacity());
		
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		
		System.out.println("Initial size : "+v.size());
		System.out.println("initial Capasity : "+v.capacity());
		
		v.addElement(new Double(5.45));
		v.addElement(new Float(5.45));

		System.out.println("Initial size : "+v.size());
		System.out.println("initial Capasity : "+v.capacity());
		System.out.println(v);
		System.out.println("First Element : "+v.firstElement());
		System.out.println("Last Element : "+v.lastElement());
		
		if(v.contains(new Integer(3)));
		System.out.println("Vector Contains 3 ");
	
		Enumeration cEum=v.elements();
		System.out.println("Element in Vector");
		
		while (cEum.hasMoreElements()) {
			System.out.println(cEum.nextElement());;
		}
		System.out.println();
	}

}
