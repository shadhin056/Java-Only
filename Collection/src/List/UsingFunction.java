package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
public class UsingFunction {

	public static void main(String[] args) {
		String [] a={"ami","tumi","shadhin","paru","jahid","shee"};
		List <String> b = new ArrayList<String>();
		
		String [] c={"shadhin","paru","jahid"};
		List <String> d = new ArrayList<String>();
		//.............................
		
		for(int i=0;i<a.length;i++)
		{
			b.add(a[i]);
		}
		
		//...........................
		for(int i=0;i<c.length;i++)
		{
			d.add(c[i]);
		}
		editList(b,d);
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i));
		}
	}
	public static void editList(Collection<String> a,Collection <String>b)
	{
		Iterator<String> a1 =a.iterator(); 
		while(a1.hasNext())
		{
			if(b.contains(a1.next()))
				a1.remove();
		}
		
	}

}
