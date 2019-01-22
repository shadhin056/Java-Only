package Normal;
import java.util.Scanner;

public class UVA_100_The_3n1_Problem {
	 static long cou(long  n)
	{

	   if (n==1)
	    return 1;
	   else if(n%2!=0)
	   {
	       return cou(3*n+1)+1;
	   }
	   else
	   {
	       return cou(n/2)+1;
	   }
	}
	  static long abc(long  a,long  b)
	 {
	     if(b<a)
	     {
	         return abc( b, a);
	     }

	      long count=0,ln;
	    while(a<=b)
	    {
	      ln=cou(a);
	        if(ln>count)
	        {
	            count=ln;
	        }
	        a++;
	    }
	    return count;
	 }
	
	public static void main(String[] args) {
		 long a,b;
		 Scanner s=new Scanner(System.in);
		 while(s.hasNext())
		 {
			 a=s.nextLong();
			 b=s.nextLong();
			 System.out.println(a+" "+b+" "+abc(a,b));
		 }
	}

}
