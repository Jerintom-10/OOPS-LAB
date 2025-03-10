import java.io.*;
import java.util.*;
class matrix
{
public static void main(String args[])
{
int r1,c1,r2,c2,i,j;
Scanner s = new Scanner(System.in);
System.out.println("Enter size of matix a :");
r1=s.nextInt();
c1=s.nextInt();
System.out.println("Enter size of matix b :");
r2=s.nextInt();
c2=s.nextInt();
int a[][]=new int[r1][c1];
int b[][]=new int[r2][c2];
int c[][]=new int[r1][c1];
System.out.println("Enter elements of matix a :");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("Enter elements of matix b :");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
b[i][j]=s.nextInt();
}
}
if((r1==r2)&&(c1==c2))
{
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("Resultant matrix is:");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
System.out.print("\t"+c[i][j]);
}
System.out.print("\n");
}
}
else
{
System.out.println("Addition not possible");
}
}
}
