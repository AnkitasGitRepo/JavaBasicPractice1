import java.util.*;
class CircleArea{
public static void main(String args[])
{
double a;
int r;
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius");
r= sc.nextInt();
double pi=3.14;
a= pi * r  * r;
System.out.println("Area of circle is"+a);
}
}