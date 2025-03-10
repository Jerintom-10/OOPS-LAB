class products
{
int pcode;
String pname;
double price;
void data(int a, String b, double c)
{
pcode=a;
pname=b;
price=c;
}
void display()
{
System.out.println(pname+ "\t"+pcode+ "\t"+price);
}
static void findlowest(double p1, double p2, double p3)
{
if(p1<=p2 && p1<=p3)
{
System.out.println("a is lowest");
}
else if(p2<=p1 && p2<=p3)
{
System.out.println("b is lowest");
}
else
{
System.out.println("c is lowest");
}
}
}
class product
{
public static void main(String args[])
{
products ob1=new products();
products ob2=new products();
products ob3=new products();
ob1.data(101,"A",65.50);
ob2.data(102,"B",100.00);
ob3.data(103,"C",50.25);
ob1.display();
ob2.display();
ob3.display();
products.findlowest(ob1.price,ob2.price,ob3.price);
}
}



