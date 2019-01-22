package Queue;

import java.util.Comparator;
/*
 * sorting
 */
import java.util.PriorityQueue;

public class SortingIgnoreCase {

	public static void main(String[] args) {
		String alphabets[] = { "banana", "A", "B", "D", "C", "F", "E", "H", "G", "J", "I", "K", "M", "L", "N", };
		PriorityQueue<String> pq = new PriorityQueue(alphabets.length, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareToIgnoreCase(o2);
			}

		});
		for (int i = 0; i < alphabets.length; i++) {
			pq.add(alphabets[i]);
		}
		System.out.println(pq);
		for (int i = 0; i < alphabets.length; i++) {
			System.out.println(pq.poll());
		}

	}

}
