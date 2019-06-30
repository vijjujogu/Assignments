package org.atmecs.apps;

import java.util.Scanner;

public class Fullcircle extends Circle
{
	Scanner scan = new Scanner(System.in);
	String color = "Black";
	String name = "Circle";
	double res;
	int rad;
    int res1;
   Fullcircle(int radius)
   {
	this.rad=radius;
	
	
   }
	public void  getName() 
	{

		System.out.println("Circle");
	}

	public  void getPerimeter() 
	{
		System.out.println("Perimeter "+2*3.14*rad);
		
	}

	public void getArea()
	{
       
		System.out.println("Area "+res1);
	}

	public void setArea()
	{
		System.out.println("enter the value of radius ");
		
		res1 = (int)3.14*rad*rad;
	 
	}
	public void getColor()
	{
		System.out.println("Black");
	}

	
	public void setColor() 
	{
		{
			Scanner sc = new Scanner(System.in);
			color = sc.next();
			System.out.println(" Set color is:   "  + color );
			}

	}

}