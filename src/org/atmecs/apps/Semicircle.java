package org.atmecs.apps;

import java.util.*;

public class Semicircle extends Circle
{
	//Semicircle semi = new Semicircle();
	Scanner scan = new Scanner(System.in);
	String color = "White";
	String name = "Semicircle";
	
    Semicircle()
	{
	
	}
	
	float PI=(float) 3.14;
	int rad = 5;
	double result=0;
	
	public void getName() 
	{

		System.out.println( "Semicircle");
	}

	public  void getPerimeter() 
	{
		System.out.println("Perimeter : "+ (PI*rad));
		
	}

	public  void getArea()
	{
        
		System.out.println("Area: "+ (PI*rad*rad)/2 );
	}

	public void setArea()
	{
		System.out.println("enter the value of radius");
		rad = scan.nextInt();
		result = (PI*rad*rad)/2; 
		getArea();
	 
	}
	public void getColor()
	{
		System.out.println("White");
	}

	
	public void setColor() 
	{
		System.out.println("Enter the color");
			
			color = scan.next();
			System.out.println(" color is:   "  + color );
			

	}

	}