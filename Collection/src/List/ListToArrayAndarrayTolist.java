package List;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class ListToArrayAndarrayTolist {

	public static void main(String[] args) {
		String[]a={"ami","tui","she"};
		LinkedList<String> list1=new LinkedList<String>(Arrays.asList(a));
		list1.add("pump");
		list1.addFirst("first");
		list1.addLast("last");;
		a = list1.toArray(new String[list1.size()]);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
