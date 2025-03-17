import java.io.*;
import java.util.*;
class symmetric
{
public static void main(String args[])
{
int r,c,i,j;
int flag=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter size of matix:");
r=s.nextInt();
c=s.nextInt();
if(r==c)
{
int a[][]=new int[r][c];
System.out.println("Enter elements of matix :");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(a[i][j]!=a[j][i])
{
flag=1;
break;
}
}
}
if(flag==1)
{
System.out.println("Given matrix is not symmetric");
}
else
{
System.out.println("Given matrix is symmetric");
}
}
else
{
System.out.println("matrix is asymmetric");
}
}
}



