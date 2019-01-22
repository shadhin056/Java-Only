package YetNot;

import java.io.*;
import java.util.*;

class Main
{
    public static void main (String args[])  
    {
        Main myWork = new Main();  
        myWork.Begin();            
    }

    void Begin()
    {
    	char[] c = new char[500];
		Scanner s=new Scanner(System.in);
		 while((c=s.next().toCharArray()) != null)
		 { 
			
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