package EnCapsulation;
//default ke onno package theke excess kora jay na

class Besic {
	private int empCode;
	private String empName;

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	private int empAge;

}

public class Main {
	public static void main(String[] args) {
		Besic obj = new Besic();
		obj.setEmpAge(16);
		obj.setEmpName("SHadhin");
		obj.setEmpCode(0);
		System.out.println(obj.getEmpAge());
		System.out.println(obj.getEmpCode());
		System.out.println(obj.getEmpName());
	}

}
