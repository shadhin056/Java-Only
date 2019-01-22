package method;

public class Joining implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Joining());
		t.start();
		System.out.println("Started");
		t.join();
		System.out.println("Complete");

	}

	@Override
	public void run() {
		System.out.println("Running");
	}

}
