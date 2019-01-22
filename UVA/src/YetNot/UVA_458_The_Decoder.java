package YetNot;
import java.util.Scanner;
public class UVA_458_The_Decoder {

	public static void main(String[] args) {
		char[] c = new char[500];
		Scanner s=new Scanner(System.in);
		 while((c=s.next().toCharArray()) != null)
		 { 
			 if(c==null)
			 {
				 break;
			 }
			 else
			 {
				 for(int i=0;i<c.length;i++)
				    {
					 System.out.print((char) (c[i]-7));
				    }
				 System.out.println();
			 }
			 
			 
		 }
		 System.out.println();
	}
}

