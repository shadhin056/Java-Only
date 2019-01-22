package Generic;
public class G {

	public static void main(String[] args) {
		Integer[] i={1,2,3,4,5};
		Character[] c={'a','b','c','d','e'};
		printme(i);
		printme(c);
	}

	
	public static <G> void printme(G[] x)
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	
//	private static void printme(Integer[] I) {
//		for(int i=0;i<I.length;i++)
//		System.out.println(I[i]);
//	}
//    private static void printme(Character[] C) {
//    	for(int i=0;i<C.length;i++)
//    	System.out.println(C[i]);
//	}

}
