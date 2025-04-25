import java.io.*;
import java.util.*;
class interface shape
{
void area();
void perimeter();
}
class circle implements shape
{
int r;
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius:");
r=sc.nextInt();
void area()
{
double area=Math.PI*r*r;
System.out.println("Area of circle="+area);
}
void perimeter()
{
double perimeter=2*Math.PI*r;
System.out.println("Perimeter of the circle="+perimeter);
}
class rectangle implements shape
{
int l,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter the length:");
l=sc.nextInt();
Scanner sc=new Scanner(System.in);
System.out.println("enter the breadth:");
b=sc.nextInt();
void area()
{
double area=l*b;
System.out.println("Area of rectanle="+area);
}
void perimeter()
{
double perimeter=2*(l+b);
System.out.println("Perimeter of the rectangle="+perimeter);
}



