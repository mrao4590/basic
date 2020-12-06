package Basics;
import java.util.Scanner;
public class Multiplication 
{

	public static void main(String[] args) 
	{
int a,b,multiply;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a and b:");
a=sc.nextInt();
b=sc.nextInt();
multiply=a*b;
System.out.println("multiplication of two numbers:"+multiply);
sc.close();
	}

}
