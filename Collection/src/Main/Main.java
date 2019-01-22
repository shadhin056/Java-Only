package Main;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List l=new LinkedList();
 //Duplicate allow
		l.add("List:angle");
		l.add("schildt");
		l.add("mathew");
		l.add("schildt");
		print(l);
//duplicate not allow
		Set s=new HashSet();
		s.add("set:rose");
		s.add("schildt");
		s.add("mathew");
		s.add("schildt");
		print(s);
//	sorted ascending order ,not duplicate
		SortedSet ss =new TreeSet();
		ss.add("set:jasmine");
		ss.add("schildt");
		ss.add("mathew");
		ss.add("schildt");
		print(ss);
	//not duplicate
		LinkedHashSet sss=new LinkedHashSet();
		sss.add("set:winslet");
		sss.add("schildt");
		sss.add("mathew");
		sss.add("schildt");
		print(sss);
// not duplicate ,last one allow
		Map ml=new HashMap();
		ml.put("map", "HashMap");
		ml.put("schildt","java2s");
		ml.put("mathew", "Hyden");
		ml.put("schildt", "java2");
		print(ml.keySet());
		print(ml.values());
//sorted key 
		SortedMap sm=new TreeMap();
		sm.put("map", "TreeMap");
		sm.put("schildt", "java2");
		sm.put("mathew", "Hyden");
		sm.put("schildt","java2s");
		print(sm.keySet());
		print(sm.values());

		LinkedHashMap lm=new LinkedHashMap();
		lm.put("map", "LinkedHashMap");
		lm.put("schildt", "java2");
		lm.put("mathew", "Hyden");
		lm.put("schildt", "java2s");
		print(lm.keySet());
		print(lm.values());
				
		
		
	}
	static void print(Collection coll)
	{
		Iterator iter =coll.iterator();
		while(iter.hasNext())
		{
			String elem=(String)iter.next();
			System.out.print(elem+" ");
		}
		System.out.println("\n");
	}

}
