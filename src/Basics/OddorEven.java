package Basics;
import java.util.Scanner;
public class OddorEven 
{

	public static void main(String[] args) 
	{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
num=sc.nextInt();
if(num%2==0)
{
	System.out.println("It is an even number");
}
else
{
	System.out.println("It is an odd number");
}
sc.close();
	}
	
}
