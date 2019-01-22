package Queue;
/*
 * sorting
 */
import java.util.PriorityQueue;

public class PriorityTest {

	public static void main(String[] args) {
		String alphabets[]={"banana","A","B","D","C","F","E","H","G","J","I","K","M","L","N",};
		PriorityQueue<String> pq=new PriorityQueue();
		for(int i=0;i<alphabets.length;i++)
		{
			pq.add(alphabets[i]);
		}
		System.out.println(pq);
		for(int i=0;i<alphabets.length;i++)
		{
			System.out.println(pq.poll());
		}
			
	}

}
