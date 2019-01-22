package Extra;

public class Core {
	public static final Core LOCK = new Core();

	public static void main(String[] args) throws InterruptedException {
		Thread a = new Thread(new Tick());
		Thread b = new Thread(new Tock());
		a.start();
		b.start();
		a.join();
		b.join();
		System.out.println("Threads finished");

	}

}

class Tick implements Runnable {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				System.out.print("Tick ");

				Thread.sleep(500);

				synchronized (Core.LOCK) {
					Core.LOCK.notify();
					Core.LOCK.wait();
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class Tock implements Runnable {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				synchronized (Core.LOCK) {
				
					Core.LOCK.wait();
				}
				System.out.print("Tock("+(i+1)+")\n");
				Thread.sleep(500);
				synchronized (Core.LOCK) {
					Core.LOCK.notify();
				}
			}
		}
		catch (Exception e) {
		}
	}
}



