package Basics;
import java.util.Scanner;
public class FactorialofaNumber 
{

	public static void main(String[] args) 
	{
int i,fact=1,num;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
num=sc.nextInt();
sc.close();
for(i=1;i<=num;i++)
{
	fact=fact*i;
}
System.out.println("factorial of a number is:"+fact);
	}

}
