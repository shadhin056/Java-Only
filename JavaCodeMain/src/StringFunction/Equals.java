package StringFunction;

public class Equals {
    public static void main(String[] args) {
    	String a =  "shadhi";
		String b =  "who";
		String c =  "ami";
		String d =  "AMI";
		String obj=new String("ami");
		//...................................
		if(c.equals(obj))
		{
			System.out.println("same");
		}
		else 
		{
			System.out.println("no");
		}
		
		
		//......................................
		    if(a.equals("shadhi"))
				{
					System.out.println("same");
				}
				else 
				{
					System.out.println("no");
				}
		    //....................................
	 if(a.equals(c))
		{
	System.out.println("same");
		}
	else 
		{
	System.out.println("no");
		}
		    //......................................
	 if(c.equalsIgnoreCase(d))
		{
	System.out.println("same");
		}
	else 
		{
	System.out.println("no");
		}
    
    }
}
