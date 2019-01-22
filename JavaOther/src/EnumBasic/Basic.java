package EnumBasic;
/*
 *  enum static final
 *  extend korte perbe na(eman class ke extend kore)
 *  interface implement korte perbe
 *  emum er obj made kora jay na bcos constructor private
 */
/*  class DayConstant{
	public static final int SAT=1;
	public static final int SUN=2;
	public static final int MON=3;
}
*/

public class Basic {
	public enum Day{
		SAT,SUN,MON,TUE,WED,THU,FRI
	};
	public static void main(String[] args) {
		for (Day s : Day.values()) {
		System.out.println(s);
		
		}
	}

}
