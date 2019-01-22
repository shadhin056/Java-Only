package Array;

import java.lang.reflect.Array;

public class Max {

	public static void main(String[] args) {
			int myList [] ={2,3,5,4,5};
			int max =0;
		
		 for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max)
	        	 {	
	        	 max = myList[i];
	        	 }
	      }
	      System.out.println("Max is " + max);
	      

	}

}
