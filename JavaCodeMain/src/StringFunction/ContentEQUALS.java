package StringFunction;

public class ContentEQUALS {

   public static void main(String args[]) {
      String str1 = "Not immutable";
      String str2 = "Strings are immutable";
      String obj=new String("Not immutable");
     // StringBuffer str3 = new StringBuffer( "Not immutable");

      boolean  result = str1.contentEquals( str2 );
      System.out.println(result);
      boolean  result1 = str1.contentEquals( obj );
      System.out.println(result1);
	  
     // result = str2.contentEquals( str3 );
     // System.out.println(result);
      
      if(result==true)
      {
    	  System.out.println("true");
      }
      else
      {
    	  System.out.println("false");
      }
   }
}