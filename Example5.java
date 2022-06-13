package org.jsp.BasicsStatic;

public class Example5 
{
	static int value;
	
	public static void main(String[] args)
	{
		 //Default value of int is printed
        System.out.println(Example5.value);
        //Intialized the value to the static member

        Example5.value = 5;
        //Printing the value of the static member
        System.out.println(Example5.value);
		
	}

}
