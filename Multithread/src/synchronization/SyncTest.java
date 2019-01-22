package synchronization;

public class SyncTest extends Thread {
	public static void main(String[] args) {
		SyncTest sc1 = new SyncTest();
		SyncTest sc2 = new SyncTest();
		sc1.start();
		sc2.start();
	}

	static synchronized void print() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep((long) (3000 * Math.random()));
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		synchronized (this) {
			print();
		}

	}
}
