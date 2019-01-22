package Easy;
import java.util.Scanner;
public class UVA_11150_Cola {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c,d,k=0;
		
		while(s.hasNext())
	    {
	        a=s.nextInt(); 
			int sum=a;
	        a=a+1;
	    for(int i=1;i<a;a=k)
	    {
	        c=a/3;
	        d=a%3;
	        k=c+d;
	        sum=sum+c;
	        if(k==2||k==1)
	        {
	            break;
	        }
	    }
	    System.out.println(sum);
	    }
	}

}
