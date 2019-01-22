package List;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HowMuchTakeTime {

	public static void main(String[] args) {
		String s[] = createArray();
		List l = Arrays.asList(s);

		System.out.println("Iterator Loop");
		long time = new Date().getTime();
		System.out.println("Start :" + time);

		Iterator<String> i = l.iterator();
		while (i.hasNext()) {
			String ss = i.next();
		}
		long timeEnd = new Date().getTime();
		System.out.println("End :" + timeEnd);

		long took = timeEnd - time;
		System.out.println("iterator Took : " + took);
		
		long time1 = new Date().getTime();
		System.out.println("Start :" + time1);
	// for loop
		for (int i1 = 0; i1 < l.size(); i1++) {
			String tt = (String) l.get(i1);
		}
		long timeEnd1 = new Date().getTime();
		System.out.println("End :" + timeEnd1);

		long took1 = timeEnd1 - time1;
		System.out.println("for loop Took : " + took1);
		
		
	}
	
	public static String[] createArray(){
		String sss[]=new String [1000000];

	for (int i = 0; i < sss.length; i++) {
		sss[i]="AMi";
	}
	return sss;
	}
	
}
