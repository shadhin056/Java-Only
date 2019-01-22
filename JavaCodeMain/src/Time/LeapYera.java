package Time;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYera {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter year :");
		int year=obj.nextInt();
		
		 GregorianCalendar gcalendar = new GregorianCalendar();
		 
		 if(gcalendar.isLeapYear(year)) {
	         System.out.println("The current year is a leap year");
	      }
	      else {
	         System.out.println("The current year is not a leap year");
	      }
	}
}
