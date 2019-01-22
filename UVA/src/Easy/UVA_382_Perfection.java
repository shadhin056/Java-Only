package Easy;
import java.util.Scanner;

public class UVA_382_Perfection {

	public static void main(String[] args) {
		int a;
		System.out.println("PERFECTION OUTPUT");
		Scanner s=new Scanner(System.in);
		 while(s.hasNext())
		 {
			 a=s.nextInt();
			 if(a==0)
	            {
				 System.out.println("END OF OUTPUT");
	                break;
	            }
			 int n=a,i,sum=0;
	         for(i=1;i<a;i++)
	         {
	             if(n%i==0)
	             sum=sum+i;
	         }
	         if(sum==a)
	         {	
	        	 
	        	 System.out.format("%5d  PERFECT\n", a);
	         }
	         else if(sum>a)
	         {	
	        	 
	        	 System.out.format("%5d  ABUNDANT\n", a);
	         }
	         else if(sum<a)
	         {	
	        	 
	        	 System.out.format("%5d  DEFICIENT\n", a);
	         }

	     }
		 }
		
		
	}

