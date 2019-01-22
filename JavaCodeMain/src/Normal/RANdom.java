package Normal;
import java.util.Random;
public class RANdom {
	public static void main(String[] args) {
		Random  dice = new Random();
		int a;
		for(int i = 0;i<10;i++)
		{
			a=dice.nextInt(6);	
			System.out.println(a);
		}
	}
}
