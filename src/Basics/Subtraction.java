package Basics;
import java.util.Scanner;
public class Subtraction 
{

	public static void main(String[] args) 
	{
int a,b,subtract;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a and b:");
a=sc.nextInt();
b=sc.nextInt();
subtract=a-b;
System.out.println("subtarction of two numbers:"+subtract);
sc.close();
	}

}
