class Rectangle
{
int l,b;
}
class CalculateArea
{
public static void main (String args[])
{
int a;
Rectangle rect = new Rectangle();                        
rect.l=20;
rect.b=60;                        
a=rect.l*rect.b;
System.out.println("Area of Rectangle is : "+a);
}
}
