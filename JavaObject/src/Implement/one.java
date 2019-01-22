package Implement;

public class one implements Animal{

   public void eat(){
      System.out.println("Mammal eats");
   }

   public void travel(){
      System.out.println("Mammal travels");
   } 

   public int noOfLegs(){
      return 0;
   }

   public static void main(String args[]){
      one m = new one();
      m.eat();
      m.travel();
   }
} 

interface Animal {

	   public void eat();
	   public void travel();
	}