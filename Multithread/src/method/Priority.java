package method;

import Thread.thread;

public class Priority extends Thread {
	@Override
	public void run() {
		System.out.println("running thread name :" + Thread.currentThread().getName());
		System.out.println("running thread Priority:" + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Priority obj1 = new Priority();
		obj1.setName("A1");
		Priority obj2 = new Priority();
		obj2.setName("A2");
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj2.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
		obj2.start();

	}

}
