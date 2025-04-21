import java.io.*;
import java.util.*;
class Emp
{
int emp_no;
String ename;
double esal;
Emp(int emp_no, String ename, double esal)
{
this.emp_no=emp_no;
this.ename=ename;
this.esal=esal;
}
}
class employee
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter n:");
int n=s.nextInt();
Emp [] emply=new Emp[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter emp_no:");
int emp_no=s.nextInt();
s.nextLine();
System.out.println("Enter employee name:");
String ename=s.nextLine();
System.out.println("Enter salary:");
double esal=s.nextDouble();
emply[i]=new Emp(emp_no,ename,esal);
System.out.println("Enter a search value:");
int a=s.nextInt();
for(int j=0;j<n;j++)
{
if(emply[j].emp_no==a)
{
System.out.print("emp_no:"+emply[j].emp_no+"ename:"+emply[j].ename+"esal:"+emply[j].esal);
}
}
}
}
}
