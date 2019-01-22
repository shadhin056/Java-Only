package Initialization;
//import java.sql.Date;
import java.util.*;

public class All {	
	double  a;
	Date cDate = new Date();
	
	String b ;
	
	public All(String b) {
		this.b = b;
	}
	public static void main(String[] args) {
		
		All obj=new All("ami");
		System.out.println(obj.a);
		System.out.println(obj.cDate);
		System.out.println(obj.b);

	}

}
