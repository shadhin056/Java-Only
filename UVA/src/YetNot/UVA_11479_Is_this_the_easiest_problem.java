package YetNot;
import java.util.Scanner;
public class UVA_11479_Is_this_the_easiest_problem {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long a,b,c;
		int T,i=1;
		T=s.nextInt(); 

	    while(T>0)
	    {
	    	a=s.nextLong();
	    	b=s.nextLong();
	    	c=s.nextLong();
	    	
	    	if((a==b)&&(b==c))
	        {
	        	System.out.println("Case "+i+": Equilateral");
	        }
	    	else if((a+b)<=c || (b+c)<=a || (c+a)<=b)
	        {
	        	System.out.println("Case "+i+": Invalid");
	        }
	        
	    	else if(a<=0 || b<=0 || c<=0)
	        	{
	        	System.out.println("Case "+i+": Invalid");
	        	}
	    	else if(a==b || b==c || c==a)
	        {
	        	System.out.println("Case "+i+": Isosceles");  
	        }
	        else
	        {	
	        	System.out.println("Case "+i+": Scalene");  
	        }
	        T--;
	        i++;
	    }

	}

}
