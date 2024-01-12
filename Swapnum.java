import java.util.*;

class Swapnum{
public static void main(String args[])
{
int a,b,temp;
Scanner sc = new Scanner(System.in);
System.out.println("Enter two number a and b");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Before Swaping");
System.out.println("a = "+a);
System.out.println("b ="+b);
temp= a;
a=b;
b=temp;

System.out.println("After Swapping");
System.out.println("a = "+a);
System.out.println("b ="+b);
}
}