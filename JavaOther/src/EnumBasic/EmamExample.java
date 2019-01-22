package EnumBasic;

enum sample {
	// WINTER(10),SUMMER(11);
	WINTER(10) {
		@Override
		public String dispSeason() {
			return "winter";
		}
	},
	SUMMER(11) {
		@Override
		public String dispSeason() {
			return "summer";
		}
	};
	public int value;
	sample(int value) {
		this.value = value;
	}
	public abstract String dispSeason();
}

public class EmamExample {
	public static void main(String[] args) {
		for (sample ss : sample.values()) {
			//System.out.println(ss + " " + ss.value);
			System.out.println(ss + " " + ss.value+" "+ss.dispSeason());
			}
	}
}