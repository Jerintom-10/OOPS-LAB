import java.io.*;
import java.util.*;
interface shape
{
void area();
void perimeter();
}
class circle implements shape
{
int r;
Scanner sc=new Scanner(System.in);
public void area()
{
System.out.println("enter the radius:");
int r=sc.nextInt();
double area=Math.PI*r*r;
System.out.println("Area of circle="+area);
}
public void perimeter()
{
System.out.println("enter the radius:");
int r=sc.nextInt();
double perimeter=2*Math.PI*r;
System.out.println("Perimeter of the circle="+perimeter);
}
}
class rectangle implements shape
{
int l,b;
Scanner sc=new Scanner(System.in);
public void area()
{
System.out.println("enter the length:");
int l=sc.nextInt();
System.out.println("enter the breadth:");
int b=sc.nextInt();
double area=l*b;
System.out.println("Area of rectanle="+area);
}
public void perimeter()
{
System.out.println("enter the length:");
int l=sc.nextInt();
System.out.println("enter the breadth:");
int b=sc.nextInt();
double perimeter=2*(l+b);
System.out.println("Perimeter of the rectangle="+perimeter);
}
}
class interf
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
circle cr=new circle();
rectangle rt=new rectangle();
System.out.println("Enter the choice: 1.Circle \n 2.Rectangle");
int n=sc.nextInt();
switch(n)
{
case 1:
cr.area();
cr.perimeter();
break;
case 2:
rt.area();
rt.perimeter();
break;
default:
System.out.println("Invalid choice");
}
}
}


