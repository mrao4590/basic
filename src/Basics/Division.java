package Basics;
import java.util.Scanner;
public class Division 
{

	public static void main(String[] args) 
	{
float a,b,divide;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a and b:");
a=sc.nextFloat();
b=sc.nextFloat();
divide=a/b;
System.out.println("division of two numbers:"+divide);
sc.close();
	}

}
