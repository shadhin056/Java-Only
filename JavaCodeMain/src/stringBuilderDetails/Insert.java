package stringBuilderDetails;
public class Insert {

   public static void main(String args[]) {
      StringBuffer sb = new StringBuffer("abcdefghijk");
      sb.insert(3,"123");
      System.out.println(" "+sb+" ");
   }  
}