package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparaTor implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		student s1 = (student) o1;
		student s2 = (student) o2;
		// System.out.println(s1.age+"compare with"+s2.age);
		if (s1.age == s2.age) {
			return 0;
		} else if (s1.age > s2.age) {
			return 1;
		} else {
			return -1;
		}
		// return s1.name.compareTo(s2.name);
	}

	public static void main(String[] args) {
		ArrayList<student> al = new ArrayList();
		al.add(new student(101, "Bari", 23));
		al.add(new student(102, "Lalon", 27));
		al.add(new student(103, "Akash", 21));

		System.out.println("Sorting by Age");

		Collections.sort(al, new ComparaTor());
		Iterator<student> oter = al.iterator();
		while (oter.hasNext()) {
			student st = oter.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}

class student {
	int rollno;
	String name;
	int age;

	public student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

}