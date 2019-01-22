package OK;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LastDayAndFirstDay {
	public LastDayAndFirstDay() {
	}

	public static void main(String args[]) throws Exception {
		LastDayAndFirstDay simpleDate = new LastDayAndFirstDay();
		String firstDate = simpleDate.getFirstDay(new Date());
		String lastDate = simpleDate.getLastDay(new Date());
		System.out.println("First Date: " + firstDate);
		System.out.println("Last Date: " + lastDate);
		// To get first day and last day of the month
		// Sunday = 1, Saturday = 7
		Calendar calendar = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date dateFirst = sdf.parse(firstDate);
		calendar.setTime(dateFirst);
		System.out.println("First Day: " + calendar.get(Calendar.DAY_OF_WEEK));
		Date dateLast = sdf.parse(lastDate);
		calendar.setTime(dateLast);
		System.out.println("Last Day: " + calendar.get(Calendar.DAY_OF_WEEK));
	}

	public String getFirstDay(Date d) throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		Date dddd = calendar.getTime();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		return sdf1.format(dddd);
	}

	public String getLastDay(Date d) throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		Date dddd = calendar.getTime();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		return sdf1.format(dddd);
	}

	public String getDate(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM");
		return sdf.format(d);
	}

	public int getLastDayOfMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
}