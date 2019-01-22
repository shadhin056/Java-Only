package shortCut;

public class Main {
	int aaa =0;
	String s;
	public int getA() {
		return aaa;
	}
	public void setA(int a) {
		this.aaa = a;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public Main(int a, String s) {
		super();
		this.aaa = a;
		this.s = s;
	}
	public static void main(String[] args) {
		Second obj=new Second();
	}
}
