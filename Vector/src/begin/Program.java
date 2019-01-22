package begin;
import java.util.Vector;
public class Program {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement(new Student(18,"Masud",75.5));
		v.addElement(new Student(51,"Monira",85.0));
		System.out.println("List of student : ");
		System.out.println("Roll: \tName: \t Mark: ");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.elementAt(i));
		}
		
		v.insertElementAt(new Student(21, "mira", 80), 1);
		System.out.println("\nAfter Insert element At position 1 : ");
		System.out.println("List of Student :");
		System.out.println("Roll: \tName: \t Mark: ");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.elementAt(i));
		}
		v.removeElementAt(0);
		System.out.println("\nAfter Removing Element of Position 0 ");
		System.out.println("List of Student :");
		System.out.println("Roll: \tName: \t Mark: ");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.elementAt(i));
		}
		
	}

}
	class Student{
		long Roll;
		String Name;
		double Mark;
		Student NextStudent;
		static Student studentlist;
		static void paint()
		{
			Student s= studentlist;
			if(s==null)
			{
				System.out.println("There is no student in the list");
			}
			else 
			do{
				System.out.println(s);
				s=s.NextStudent;
			}while(s!=null);
				
				
		}
		
		Student (long Roll ,String Name ,double Mark)
		{
			this.Roll=Roll;
			this.Name=Name;
			this.Mark=Mark;
			this.NextStudent=studentlist;
			studentlist=this;
		}
		public String toString()
		{
			return new String(Roll +"\t"+ Name +"\t"+ Mark);
		}
		
	}