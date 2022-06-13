package org.jsp.BasicsStatic;

public class Example1 
{
	public static void main(String[] args) 
	{
		print();
		view();
	Example1 e1 = 	new Example1();
	e1.display();
	e1.displays();
		
		
	}
	public static void print()
	{
		System.out.println("Static method 1");
	}
	public static void view()
	{
		System.out.println("Static method 2");
	}
	
	public void display()
	{
		System.out.println("Instance method 1");
	}
	public void displays()
	{
		System.out.println("Instance method 2");
	}

}
