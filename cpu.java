import java.io.*;
import java.util.*;
class C
{
int price;
C(int p)
{
price=p;
}
class Processor
{
int cores;
String manufacturer;
Processor(int x, String m)
{
cores=x;
manufacturer=m;
}
void display()
{
System.out.println("No. of cores:"+cores);
System.out.println("Manufacturer:"+manufacturer);
}
static class RAM
{
int memory;
String manufacturer;
RAM(int y, String n)
{
memory=y;
manufacturer=n;
}
void display()
{
System.out.println("Memory:"+memory);
System.out.println("Manufacturer:"+manufacturer);
}
}
void display()
{
System.out.println("Price:"+price);
}
}
class cpu
{
public static void main(String args[])
{
C abc  = new C(15000);
C.Processor np=abc.new Processor(3,"intel"); 
C.RAM s=new C.RAM(256,"samsung");
abc.display();
np.display();
s.display();
}
}


