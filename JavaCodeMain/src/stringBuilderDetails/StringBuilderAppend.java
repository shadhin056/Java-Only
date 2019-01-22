package stringBuilderDetails;
// Fig. 16.13: StringBuilderAppend.java
// StringBuilder append methods.

public class StringBuilderAppend 
{
   public static void main( String[] args )
   {
      Object obj = "hello";
      String string = "goodbye";  
      char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
      boolean booleanValue = true;
      char characterValue = 'Z';
      int integerValue = 7;
      long longValue = 10000000000L;
      float floatValue = 2.5f; 
      double doubleValue = 33.333;

      StringBuilder lastBuffer = new StringBuilder( "last buffer" );
      StringBuilder buffer = new StringBuilder();

      buffer.append( obj );
      buffer.append( "\n" );
      buffer.append( string );
      buffer.append( "\n" );
      buffer.append( charArray );
      buffer.append( "\n" );
      buffer.append( charArray, 0, 3 );
      buffer.append( "\n" );
      buffer.append( booleanValue );
      buffer.append( "\n" );
      buffer.append( characterValue );
      buffer.append( "\n" );
      buffer.append( integerValue );
      buffer.append( "\n" );
      buffer.append( longValue );
      buffer.append( "\n" );
      buffer.append( floatValue );
      buffer.append( "\n" );
      buffer.append( doubleValue );
      buffer.append( "\n" );
      buffer.append( lastBuffer );

     // System.out.printf( "buffer contains %s\n", buffer.toString() );
      System.out.println("buffer contains \n"+buffer.toString());
      
   } // end main
} // end StringBuilderAppend