package THrowAndThrows;

public class Basic {

	public static void main(String[] args) {
		try {
			int x=0;
			int y=34/x;
			int z[]=new int[2];
			System.out.println(z[3]);
		} catch (ArithmeticException e) {
			System.err.println("you have a problem at calculation");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("  Finished");
		}

	}

}
