package Time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayToString {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a");

		Date today = Calendar.getInstance().getTime();
		String s = df.format(today);
		System.out.println("Current Date : " + s);
	}

}
