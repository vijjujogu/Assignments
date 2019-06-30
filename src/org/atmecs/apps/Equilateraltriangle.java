package org.atmecs.apps;

import java.util.*;

public class Equilateraltriangle extends Triangle
{
	Scanner sc = new Scanner(System.in);
	String color="Grey";
	int breath=14, height=10,hypo=2;
   public void getPerimeter()
	{
		System.out.println("Perimeter is:"+ (3*hypo) );
		}
	public void getArea()
	{
		System.out.println("Area is"+ (Math.sqrt(3) / 4) * hypo* hypo );
		
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
		System.out.println(" This is a Equilateral triangle");
		
}
}