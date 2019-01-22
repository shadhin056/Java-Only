package Thread;
public class thread {
	public static void main(String[] args) {
		Thread t = new Thread() {

			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("this is thread");
					try {
						sleep(100);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}
		};
		t.start();
		Thread t2 = new Thread() {

			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("this is thread 2");
					try {
						sleep(100);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
	}
}