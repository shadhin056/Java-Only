package Normal;
public class Array2Dinput {
	public static void main(String[] args) {
		
		int two[][]={{8,3,4,5},{2,4,5,3,6},{4,1,2,5,7,8}};
		int one[][]={{4,2,4,5,3},{1,2,4,5,6},{5}};
		
		System.out.println("One");
		display(one);
		System.out.println("TWO");
		display(two);
	}
	public  static void display(int x[][])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println("\t");
		}
	}
}
