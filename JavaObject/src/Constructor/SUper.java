package Constructor;
public class SUper {
	public static void main(String[] args) {
		Cccccc objA = new Cccccc();
	}
}
 class Aaaaaa {
		public Aaaaaa(){
			System.out.println("A");
		}
}
 class Bbbbbb extends Aaaaaa{
	public Bbbbbb(){
		System.out.println("B");
	}
}
 class Cccccc extends Bbbbbb{
	    public Cccccc(){
	    	System.out.println("C");
	    }
	}

