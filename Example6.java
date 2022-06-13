package org.jsp.BasicsStatic;

public class Example6 
{
	public static void main(String[] args)
	{
		
		display();
		Example6 e1 = new Example6();
		e1.view();
		
	}
	public static void display() 
	{
		int x = 100;
		System.out.println(x);
	}
	public void view()
	{
		int y = 123;
		System.out.println(y);
	}

}
