package Time;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDay {

	public static void main(String[] args) throws ParseException {
		String s = "19/09/2013";
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Date d = f.parse(s);
		DateFormat f1 = new SimpleDateFormat("EEEE");
		DateFormat f2 = new SimpleDateFormat("EE");
		String fullday = f1.format(d);
		String shortday = f2.format(d);
		System.out.println(fullday);
		System.out.println(shortday);
	}

}
