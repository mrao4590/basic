package Basics;
import java.util.Scanner;
public class Addition 
{

	public static void main(String[] args) 
	{
int a,b,sum;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a and b:");
a=sc.nextInt();
b=sc.nextInt();
sum=a+b;
System.out.println("The sum of two numbers:"+sum);
sc.close();
	}

}
