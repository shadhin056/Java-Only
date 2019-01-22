package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*List
A List is an ordered Collection (sometimes called a sequence).
Lists may contain duplicate elements.
Elements can be inserted or accessed by their position in the list,
using a zero-based index.

ArrayList
LinkedList
Vector
 * 
 * Duplicate allow
 * faster iteration and faster random access
 * Ordered list
 * Not Sorted
 * This is preferred to use when you need faster iteration and you do not need lost of insertion od deletion.
 */
public class AddRemoveGet {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();

		System.out.println("Size of List :" + list.size() + list);
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println("Size of List :" + list.size() + list);
		list.add(2, "C");
		System.out.println("Size of List :" + list.size() + list);

		list.remove(2);
		System.out.println("Size of List :" + list.size() + list);
		list.remove("D");
		System.out.println("Size of List :" + list.size() + list);
		System.out.println("Using for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		Iterator<String> iterator = list.iterator();
		System.out.println("Using Iteration");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("using While loop");
		int i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		System.out.println("Using advance loop");
		for (String s : list)
			System.out.println(s);
	}

}
