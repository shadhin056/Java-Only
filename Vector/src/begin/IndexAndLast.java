package begin;

public class IndexAndLast {

	public static void main(String[] args) {
		String s="Object oriented programming";
		System.out.println("In the string :  "+s);
		int p=s.indexOf("t");
		System.out.println("t in this string is at "+p);
		int q=s.lastIndexOf("t");
		System.out.println("last index of t is "+q);
		System.out.println("index of prog is :"+s.indexOf("prog"));
		
		int a=s.indexOf("t",10);
		System.out.println("after 10 :"+a);
		
		int b=s.lastIndexOf("t",5);
		System.out.println("last index t "+b);
		int cc=s.lastIndexOf("t",15);
		System.out.println("last index after 15  :"+cc);
		
	}

}
