package Static;

public class variable {

	public static void main(String[] args) {
			Twostatic objTwostatic=new Twostatic();
			System.out.println(objTwostatic.a);
			Twostatic objTwostatic2=new Twostatic();
			System.out.println(objTwostatic.a);

	}

}

 class Twostatic {
			static int a;
}
