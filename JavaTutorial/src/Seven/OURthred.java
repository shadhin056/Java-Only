package Seven;

public class OURthred extends Thread {

	// ...............................

	private String threadname;
	private int startingPoint;
	private int count;
	private int adder;
	private int timeDifferent;
	private boolean threadAliveFlag;
	
	// ..................................

	public OURthred(String threadname, int startingPoint, int count, int adder,
			int timeDifferent, boolean threadAliveFlag) {
		this.threadname = threadname;
		this.startingPoint = startingPoint;
		this.adder = adder;
		this.timeDifferent = timeDifferent;
		this.threadAliveFlag = threadAliveFlag;
	}

	// ................................

	@Override
	public void run() {
		count = startingPoint;
		while (threadAliveFlag) {

		}
	}

	// ................................

	public String getThreadname() {
		return threadname;
	}

	public void setThreadname(String threadname) {
		this.threadname = threadname;
	}

	public int getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(int startingPoint) {
		this.startingPoint = startingPoint;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getAdder() {
		return adder;
	}

	public void setAdder(int adder) {
		this.adder = adder;
	}

	public int getTimeDifferent() {
		return timeDifferent;
	}

	public void setTimeDifferent(int timeDifferent) {
		this.timeDifferent = timeDifferent;
	}

	public boolean isThreadAliveFlag() {
		return threadAliveFlag;
	}

	public void setThreadAliveFlag(boolean threadAliveFlag) {
		this.threadAliveFlag = threadAliveFlag;
	}

}
