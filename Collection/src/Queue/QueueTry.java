package Queue;

import java.util.PriorityQueue;

public class QueueTry {

	public static void main(String[] args) {
		PriorityQueue<String>a=new PriorityQueue<String>();
		a.offer("first");
		a.offer("Second");
		a.offer("third");
		
		System.out.println(a);
		System.out.println(a.peek());
		a.poll();
		System.out.println(a);
	}

}
