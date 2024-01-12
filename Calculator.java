import java.util.*;
class Calculator{
public static void main(String args[])
{
int a,b,c,d,e,f,g;
Scanner sc = new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c= a +b ;
d= a -b ;
e= a *b ;
f= a /b;
g= a %b ;
System.out.println("Additon of two num "+ c);
System.out.println("Sum of two num "+ d);
System.out.println("Multiplication of two num "+ e);
System.out.println("Dividation of two num "+ f);
System.out.println("REminder of two num "+ g);
}
}