public class Student 
{
String name;
public transient int USN;
float marks;
String PhNumber=null;
Student(String name,int USN,float marks)
{
this.name=name;
this.USN=USN;
this.marks= marks;

}
@Override
public String toString() {
	return this.name+" "+this.USN+" "+this.marks+" "+this.PhNumber;

}



}

