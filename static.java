class Check{
static int i;
int j;
static{
i=11;
System.out.println("static block called ");
}
}
class Main{
public static void main(String args[]) {
System.out.println(Check.i); 
}
}
