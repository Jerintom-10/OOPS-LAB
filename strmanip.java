import java.io.*;
import java.util.*;
class strmanip
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String a,b,c;
System.out.print("Enter a string:");
a=s.next();
System.out.print("Enter another string:");
b=s.next();
c=a+""+b;
System.out.println("Length of 1st string: " + a.length());
System.out.println("Length of 2nd string: " +b.length());
System.out.println("Concatenate of strings: " +c);
System.out.println("Character at position 5 of "+c+":"+c.charAt(5));
System.out.println("Comparison of strings:"+a.compareTo(b));
System.out.println("last index of 's' is:"+c.lastIndexOf('s'));
System.out.println("Endswith character 'r': "+c.endsWith("r"));
System.out.println("Conversion to UpperCase: " + c.toUpperCase());
System.out.println("Conversion to LowerCase: " + c.toLowerCase());
}
}
