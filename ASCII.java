import java.util.Scanner;  
public class ASCII 
{  
public static void main(String args[])  
{  
char ch;
Scanner sc= new Scanner(System.in);
System.out.println("Enter character");
ch = sc.next().charAt(0);
int a = ch;
System.out.println("ASCI value of "+ch + "is " +a);

}  
}  
