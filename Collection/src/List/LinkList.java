package List;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkList {

	public static void main(String[] args) {
		String []a={"apple","noobs","pwnge","bacane"};
		List<String> list1=new LinkedList<String>();
		String []b={"app","noo","pwn","bac"};
		List<String> list2=new LinkedList<String>();
		
		for(int i=0;i<a.length;i++)
		{
			list1.add(a[i]);
			list2.add(b[i]);
		}
		list1.addAll(list2);
		list2=null;
		
		System.out.println(" ");
		printme(list1);
		remove(list1,2,5);
		System.out.println(" ");
		printme(list1);
		System.out.println(" ");
		reverseme(list1);
	}

		public static void printme(List<String>aa)
		{
			for(int i=0;i<aa.size();i++)
			{
				System.out.print(aa.get(i)+" ");
			}
		}
		public static void remove(List<String>bb,int form,int to)
		{
			bb.subList(form, to).clear();
		}
		public static void reverseme(List<String>cc)
		{
			ListIterator<String >re=cc.listIterator(cc.size());
			
			while(re.hasPrevious())
			{
				System.out.print(re.previous()+" ");
			}
		}
}
