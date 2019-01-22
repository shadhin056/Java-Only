package Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String2Day {

	public static void main(String[] args) throws ParseException {
		String input_date="19/09/2013";
		SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
		Date d=f.parse(input_date);
		System.out.println(d);
	}

}
