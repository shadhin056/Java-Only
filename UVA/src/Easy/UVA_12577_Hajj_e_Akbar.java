package Easy;
import java.util.Scanner;
public class UVA_12577_Hajj_e_Akbar {

	public static void main(String[] args) {
		String a=new String();
		int i=1;
		Scanner s=new Scanner(System.in);
		 while((a=s.nextLine()) != null)
		    {
			 if(a.charAt(0)=='*')
		           break;
			 else if(a.equals("Hajj"))
			 {
				 System.out.println("Case "+i+":"+" Hajj-e-Akbar");
			 }
			 else if (a.equals("Umrah")) {
				 System.out.println("Case "+i+":"+" Hajj-e-Asghar");
			}
			 i++;
		    }

	}

}
