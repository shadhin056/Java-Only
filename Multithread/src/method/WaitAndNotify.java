package method;

public class WaitAndNotify {
	int amount = 10000;

	synchronized public void withdraw(int amount) throws InterruptedException {
		System.out.println("withdraw...");
		if (this.amount < amount) {
			System.out.println("Balance is less");
			wait();
			this.amount = this.amount - amount;
			System.out.println("withdraw completed...");
			System.out.println("Amount :"+this.amount);
		}
	}

	synchronized void deposit(int amount) {
		System.out.println("deosit...");
		this.amount = this.amount + amount;
		System.out.println("Deposite Complete");
		notify();
		
	}

	public static void main(String[] args) {
		WaitAndNotify obj = new WaitAndNotify();
		new Thread() {
			public void run() {
				try {
					obj.withdraw(15000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				obj.deposit(10000);
			}
		}.start();
	}

}
