package Static;
public class Big {
	static int a = 5;

	public static void main(String[] args) {
		int n = 0;
		n = a;
		patient obj = new patient("p1", 1);
		System.out.println(obj);
		patient obj1 = new patient("p2", 2);
		System.out.println(obj1);
		patient obj2 = new patient("p3", 3);
		System.out.println(obj2);
	}
}

class patient {
private String name;
private int idname;
private static int numpatients;

public patient(String name, int idname) {
	
	this.name = name;
	this.idname = idname;
	this.numpatients = this.numpatients+1;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getIdname() {
	return idname;
}

public void setIdname(int idname) {
	this.idname = idname;
}

public int getNumpatients() {
	return numpatients;
}

public void setNumpatients(int numpatients) {
	this.numpatients = numpatients;
}
public String toString()
{	
return "NAME "+name+"  ID  "+idname+" Total numpatients  "+numpatients;	
}
}
