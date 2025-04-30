import java.io.*;
import java.util.*;
class userException extends Exception
{
public userException(String s)
{
super(s);
}
}
class exception
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String uname,pass;
try
{
System.out.println("Enter Username:");
uname=sc.nextLine();
if(uname=="")
{
throw new userException("No user Name...");
}
if(uname.length()<8)
{
throw new userException("Greater than 8 characters..");
}
}
catch(userException e)
{
System.out.println("Username Error");
System.out.println(e.getMessage());
}
try
{
System.out.println("Enter Password");
pass=sc.nextLine();
if(pass=="")
{
throw new userException("Invalid Password!!!");
}
if(pass.length()>8)
{
throw new userException("Password should not be greater tha 8 charcters!!!");
}
}
catch(userException es)
{
System.out.println("Password Error");
System.out.println(es.getMessage());
}
}
}
