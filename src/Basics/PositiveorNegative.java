package Basics;
import java.util.Scanner;
public class PositiveorNegative 
{

	public static void main(String[] args) 
	{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
num=sc.nextInt();
sc.close();
if(num>0)
	System.out.println("It is a Positive number");
else if(num<0)
{
	System.out.println("It is a Negative number");
}
else
	System.out.println("you entered a zero");
	}

}
