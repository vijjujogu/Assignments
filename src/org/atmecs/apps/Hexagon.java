package org.atmecs.apps;

import java.util.Scanner;

public class Hexagon implements Shape
{
		 Scanner scan = new Scanner(System.in);
		 private String color = "Blue";
		 private String name = "Hexagon";
		 double Area=2,Side=6,Perimeter=2;

		public void getName()
		{
		System.out.println("The is a Hexagon");
		
		}

		public void getArea()
		{
		Area= 3 * 1.732 * Side * Side / 2;
		System.out.println(" Area is :  "  +   ( 3 * 1.732 * Side * Side / 2));
		
		}

		public void getPerimeter() 
		{
		Perimeter = 6 * Side;
		System.out.println(" Perimeter is:  " + (6 * Side));
		
		}

		public void setColor() 
		{
		Scanner sc = new Scanner(System.in);
		color = sc.next();
		System.out.println(" Set color is:   "  + color );
		}
		public void  getColor()
		{
		System.out.println("color is:" + color);
		}

		}