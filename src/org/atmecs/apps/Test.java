package org.atmecs.apps;

import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		System.out.println("Enter your choice /n 1. Circle /n 2.TriangleRE /n 3.Triangle /n 4.Square /n 5.Hexagon /n 6.Pentagon");
		Scanner sc = new Scanner (System.in);
		Shape shape = null;
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("1. Semicircle  2. Full circle");
		int choice1 = sc.nextInt();
		if(choice==1)
		{
			shape = new Semicircle();
			shape.getName();
			shape.getColor();
			shape.getArea();
			shape.getPerimeter();
			shape.setColor();
		}

		else
		{
			shape = new Fullcircle(choice1);
			shape.getName();
			shape.getColor();
			shape.getArea();
			shape.getPerimeter();
			shape.setColor();
		}
		break;
		case 2: System.out.println("1.Rightangletriangle 2.Equilateraltriangle");
		int choice2 = sc.nextInt();
		if (choice2==1)
		{
			shape = new Rightangletriangle();
			shape.getName();
			shape.getColor();
			shape.getArea();
			shape.getPerimeter();
			shape.setColor();
		}
		else
			shape = new Equilateraltriangle();
		shape.getName();
		shape.getColor();
		shape.getArea();
		shape.getPerimeter();
		shape.setColor();

		break;

		case 3: shape = new Triangle();
		shape.getName();
		shape.getColor();
		shape.getArea();
		shape.getPerimeter();
		shape.setColor();
		break;
		case 4: shape = new Square();
		         shape.getName();
		         shape.getColor();
		         shape.getArea();
		           shape.getPerimeter();
		       shape.setColor();
		break;
		case 5: shape = new Hexagon();
		shape.getName();
		shape.getColor();
		shape.getArea();
		shape.getPerimeter();
		shape.setColor();
		break;
		case 6: shape = new Pentagon();
		shape.getName();
		shape.getColor();
		shape.getArea();
		shape.getPerimeter();
		shape.setColor();
		break;
		}
	}

}