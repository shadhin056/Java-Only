package Time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeOne {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(dateFormat.format(date));
		System.out.println(dateFormat1.format(date));
		
		System.out.println("Using Calender");
		Calendar cal = Calendar.getInstance();
		String s = cal.getTime().toString();
		System.out.println(s);
		System.out.println(dateFormat1.format(cal.getTime()));
	}
}
