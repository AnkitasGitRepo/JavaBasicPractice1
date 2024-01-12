import java.util.*;
class Swapwithout{
public static void main(String args[])
{
int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("Swapping two number withoud third number");
System.out.println("Enter two number");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Before Swapping");
System.out.println("a = "+a);
System.out.println("b ="+b);
a=a-b;
b=a+b;
a=b-a;

System.out.println("After Swapping");
System.out.println("a = "+a);
System.out.println("b ="+b);
}
}