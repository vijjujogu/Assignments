package org.atmecs.apps;

import java.util.Scanner;

public class Pentagon implements Shape
{

	 Scanner scan = new Scanner(System.in);
	 private String color = "Pink";
	 private String name = "Pentagon";
	 double Area=3,Side=4,Perimeter=8;

	public void getName()
	{
	System.out.println("This is a Pentagon");

	}

	public void getArea()
	{
	Area=(5.0/2.0)*Side*Side;

	System.out.println(" Area is :  "  + ((5.0/2.0)*Side*Side));
	
	}

	public void getPerimeter() 
	{
	Perimeter = 5 * Side;
	System.out.println(" Perimeter is :   " + (5*Side) );

	}

	public void setColor() 
	{
		System.out.println("Enter the color");
	    color = scan.next();
		System.out.println(" color is:   "  + color );
	}
	public void  getColor()
	{
	System.out.println("color is:" + color);
	}

	}
