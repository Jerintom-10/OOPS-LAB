import java.io.*;
import java.util.*;
class student
{
String name="Messi";
}
class sports extends student
{
String sportname="Football";
}
class result extends sports
{
String sportscore="Second";
String academicscore="A+";
void display()
{
System.out.println("Student name:" + name);
System.out.println("Sports name:" + sportname);
System.out.println("Academic Score:" + academicscore);
}
}
class sport
{
public static void main(String args[])
{
result r=new result();
r.display();
}
}  
