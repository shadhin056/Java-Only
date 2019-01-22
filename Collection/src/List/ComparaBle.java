package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

//collection object sorting
public class ComparaBle {

	public static void main(String[] args) {
		ArrayList<SStudent> al = new ArrayList();
		al.add(new SStudent(101, "Bari", 23));
		al.add(new SStudent(102, "Lalon", 27));
		al.add(new SStudent(103, "Akash", 21));

		Collections.sort(al);
		Iterator<SStudent> oter = al.iterator();
		while (oter.hasNext()) {
			SStudent st = oter.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}

class SStudent implements Comparable {
	int rollno;
	String name;
	int age;

	public SStudent(int rollno, String name, int age) {

		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object obj) {
		SStudent st = (SStudent) obj;
		System.out.println(" this age :" + this.age + "compare with" + st.age);
		return st.age - this.age;

	}
}











