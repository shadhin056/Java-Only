package EnumBasic;

enum DayEnum {
	SAT, SUN, MON
}

class DayConstant {
	public static final int SAT = 1;
	public static final int SUN = 2;
	public static final int MON = 3;
}

public class Main {
	static void enumexample(DayEnum Eobj) {
		if (Eobj == DayEnum.SAT)
			System.out.println("E_saturday");
		else if (Eobj == DayEnum.SUN)
			System.out.println("E_sunday");
		else {
			System.out.println("invalid");
		}
	}

	static void constantExample(int i) {
		if (i == 1)
			System.out.println("C-saturday");
		else if (i == 2)
			System.out.println("C-sunday");
		else
			System.out.println("invalid");
	}

	public static void main(String[] args) {
		enumexample(DayEnum.SAT);
		enumexample(DayEnum.SUN);
		constantExample(1);
		constantExample(2);

	}

}
