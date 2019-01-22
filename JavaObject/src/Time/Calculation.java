package Time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calculation {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cl = Calendar.getInstance();
		System.out.println("Date is : " + sdf.format(cl.getTime()));

		System.out.println("Next 7 dates from the date are : ");
		for (int i = 1; i < 8; i++) {
			cl.add(Calendar.DATE, i);
			System.out.println(sdf.format(cl.getTime()));
			cl = Calendar.getInstance();
		}

	}

}
