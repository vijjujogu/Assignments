package org.atmecs.apps;

import java.util.Scanner;

public class Rightangletriangle extends Triangle
{
	Scanner sc = new Scanner(System.in);
	String color="Yellow";
	String name = "Rightangletriangle";
	int breath=10, height=15,hypo=2;
   public void getPerimeter()
	{
		System.out.println("Perimeter is:"+ (breath+height+hypo));
		}
	public void getArea()
	{
		System.out.println("Area is:"+ ((breath+height)/2));
		
	}

	public void setcolor() 
	{
       System.out.println("Enter the color");
		
		color = sc.next();
		System.out.println(" color is:   "  + color );	
	}

	public void getColor() 
	{
		System.out.println(color);
	}
	public void getName()
	{
		System.out.println(" This is a Right-angleTriangle");
		
}
}