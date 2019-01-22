package stack;

import java.util.Stack;

import javax.print.attribute.standard.PrinterState;

public class Stacks {

	public static void main(String[] args) {
		Stack<String> a=new Stack<String>();
		a.push("bottom");
		PrinterState(a);
		
		a.push("second");
		PrinterState(a);
		
		a.push("third");
		PrinterState(a);
		System.out.println(a.peek());
		a.pop();
		PrinterState(a);
		
		a.pop();
		PrinterState(a);
		
		a.pop();
		PrinterState(a);
		
	}

	private static void PrinterState(Stack<String> a) {
		if(a.empty())
		{
			System.out.println("empty");
		}
		else
		{
			System.out.println("not empty"+a);
			
		}
		
		
		
	}

}
