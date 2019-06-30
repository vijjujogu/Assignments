package org.atmecs.apps;

import java.util.Scanner;

public class Triangle implements Shape
{
	int breath, height,hypo ;
	String color="purple";
	Scanner scan = new Scanner(System.in);
	
	public void getPerimeter()
	{
		System.out.println("Perimeter "+breath+height+hypo);
	
		
	}

	public void getArea()
	{
		
		System.out.println("area" + ((breath+height)/2));
	}

	public void getColor()
	{
		System.out.println(color);
		
	}

	public void setColor() 
	{
		System.out.println("Enter the color");
		
		color = scan.next();
		System.out.println(" color is:   "  + color );
		
		
	}

	public void getName()
	{
		System.out.println(" This is a Triangle");
		
	}
	}