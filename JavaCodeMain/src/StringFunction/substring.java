package StringFunction;

import java.io.*;

public class substring{
   public static void main(String args[]){
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value :" );
      System.out.println(Str.substring(10) );

      System.out.print("Return Value :" );
      System.out.println(Str.substring(10, 15) );
   }
}