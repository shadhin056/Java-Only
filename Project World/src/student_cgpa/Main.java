package student_cgpa;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int select;
		Student sobj=new Student();
		Scanner s=new Scanner(System.in);
		System.out.println("Select Option ");
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println("| 1...INPUT   |\n| 2...SEARCH  |\n| 3...SHOW all| \n| 4...LOGOUT  |");
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println("Your Select :");
		select=s.nextInt();
		
			switch (select) {
			case 1:
				sobj.inputinfo();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("Please Try again later");
				break;
			}

		
	}
}
