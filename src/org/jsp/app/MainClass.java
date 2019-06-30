package org.jsp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args)
{
	ApplicationContext ac=new ClassPathXmlApplicationContext("sample1.xml");
	Student st1=(Student) ac.getBean("s1");
	System.out.println(st1);
}
}
