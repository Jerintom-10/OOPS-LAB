import java.util.*;
class mtables extends Thread
{
int n;
mtables(int n)
{
this.n=n;
}
public void run()
{
for(i=0;i<=n;i++)
{
System.out.println("5 x "+i+"="+(5*i));
}
}
}
class prime extends Thread
{
int n;
public void run()
{
int count=0,x=0,i=1;
prime(int n)
{
this.n=n;
}
}
{
System.out.println("Prime numbers are:");
}
}
class thread
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int muln,primen;
System.out.println("Enter n:");
muln=sc.nextInt();
mtables t1=new mtables(muln);
System.out.println("Enter n:");
primen=sc.nextInt();
prime t2=new prime(primen);
t1.start();
t2.start();
}
}
