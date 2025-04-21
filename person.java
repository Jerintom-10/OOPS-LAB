import java.io.*;
import java.util.*;
class personx
{
String name;
String gender;
String address;
int age;
personx(String name, String gender, String address, int age)
{
this.name=name;
this.gender=gender;
this.address=address;
this.age=age;
}
}
class employee extends personx
{
int emp_id;
String companyname;
String qualification;
int salary;
employee(String name, String gender, String address, int age, int emp_id, String companyname, String qualification, int salary)
{
super(name,gender,address,age);
this.emp_id=emp_id;
this.companyname=companyname;
this.qualification=qualification;
this.salary=salary;
}
}
class teacher extends employee
{
String subject;
String department;
int teacher_id;
teacher(String name, String gender, String address, int age, int emp_id, String companyname, String qualification, int salary, String subject, String department, int teacher_id)
{
super(name,gender,address,age,emp_id,companyname,qualification,salary);
this.subject=subject;
this.department=department;
this.teacher_id=teacher_id;
}
void display()
{
System.out.println("_______________\nTeacher Details\n____________");
System.out.println("Name:"+name);
System.out.println("Gender:"+gender);
System.out.println("Address:"+address);
System.out.println("Age:"+age);
System.out.println("EmpID:"+emp_id);
System.out.println("Company Name:"+companyname);
System.out.println("Qualificatin:"+qualification);
System.out.println("Salary:"+salary);
System.out.println("Subject:"+subject);
System.out.println("Department:"+department);
System.out.println("TeacherID:"+teacher_id);
}
}
class person
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n:");
int n=sc.nextInt();
teacher[] te=new teacher[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter"+(i+1)+"teacher details:");
System.out.println("Enter name:");
String name=sc.next();
System.out.println("Enter gender:");
String gender=sc.next();
System.out.println("Enter address:");
String address=sc.next();
System.out.println("Enter age:");
int age=sc.nextInt();
System.out.println("Enter EmpID:");
int emp_id=sc.nextInt();
System.out.println("Enter Company Name:");
String companyname=sc.next();
System.out.println("Enter qualification:");
String qualification=sc.next();
System.out.println("Enter salary:");
int salary=sc.nextInt();
System.out.println("Enter Subject:");
String subject=sc.next();
System.out.println("Enter Department:");
String department=sc.next();
System.out.println("Enter TeacherID:");
int teacher_id=sc.nextInt();
te[i]=new teacher(name,gender,address,age,emp_id,companyname,qualification,salary,subject,department,teacher_id);
}
for(int i=0;i<n;i++)
{
te[i].display();
}
}
}



