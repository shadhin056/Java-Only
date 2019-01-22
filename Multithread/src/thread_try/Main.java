package thread_try;

import org.omg.Messaging.SyncScopeHelper;

class one extends Thread {

	one() {
		super("Demo Thread");
		System.out.println("Child thread: " + this);
		this.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread :" + i);

				sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted");
		}
		System.out.println("Exiting child thread");
	}

}

public class Main {

	public static void main(String[] args) {
		new one();
		try {
			for (int i = 5; i > 0; i--)

				System.out.println("Main thread : " + i);

			Thread.sleep(1000);
		} catch (InterruptedException e) {

			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread exiting");
	}
}
