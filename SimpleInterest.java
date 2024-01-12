import java.io.*;
import java.util.*;

class SimpleInterest
 {
public static void main(String args[])
{
float p,t,r,si;
Scanner sc = new Scanner(System.in);
System.out.println("Enter principal ammount, time period and rate of Interest");
p =sc.nextFloat();
r =sc.nextFloat();
t =sc.nextFloat();

si = (p * t * r) / 100;

System.out.println("Simple interest = " + si);
 }
}