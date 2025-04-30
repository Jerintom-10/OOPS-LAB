import java.io.*;
import java.util.*;
class excpt extends Exception
{
public excpt(String s)
{
super(s);
}
}
class expt
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int count,i;
System.out.println("Please enter numbers to be calculated:");
count=sc.nextInt();
int[] numbers=new int[count];
try
{
System.out.println("please enter"+count+"numbers:");
for(i=0;i<count;i++)
{
int num=sc.nextInt();
numbers[i]=num;
if(num<0)
{
throw new excpt("Negative numbers are not allowed");
}
}
int sum=0;
for(i=0;i<count;i++)
{
sum+=numbers[i];
}
float average=(float)sum/count;
System.out.println("average of given numbers is:"+average);
}
catch(excpt ex)
{
System.out.println("Exception caught!!");
System.out.println(ex.getMessage());
}
}
}

