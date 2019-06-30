package org.atmecs.apps;

import java.util.Scanner;

public class Square implements Shape
{
Scanner scan = new Scanner(System.in);
String color = "Red";
String name = "Square";
double Area=5,Side=5,Perimeter=2;
public void getName()
{
System.out.println("This is Square");
}

public void getArea()
{
Area = Side * Side;
System.out.println(" Area is :   "  +  ( Side * Side));
}

public  void getPerimeter() 
{
Perimeter = 4 * Side;
System.out.println(" Perimeter is:   " + (4*Side));
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