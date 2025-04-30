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
for(int i=0;i<=n;i++)
{
System.out.println("5 x "+i+"="+(5*i));
}
}
}
class ptable extends Thread
{
int n;
ptable(int n)
{
this.n=n;
}
public void run()
{
int count=0,x=0,i=1;
System.out.println("prime numbers are:");
while(x!=n)
{
count=0;
for(int j=2;j<=i/2;j++)
{
if(i%j==0)
{
count++;
break;
}
}
if(count==0 && i!=1)
{
System.out.println(i+"");
x++;
}
i++;
}
}
}
class thred
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int muln,prime;
System.out.println("Enter n:");
muln=sc.nextInt();
mtables t1=new mtables(muln);
System.out.println("Enter n:");
prime=sc.nextInt();
ptable t2=new ptable(prime);
t1.start();
t2.start();
}
}
