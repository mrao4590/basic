package Basics;
import java.util.Scanner;
public class Palindromeornot 
{

	public static void main(String[] args) 
	{
int num,sum=0,remainder,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
num=sc.nextInt();
sc.close();
temp=num;
while(num>0)
{
	remainder=num%10;
	sum=sum*10+remainder;
	num=num/10;
	}
if(temp==sum)
{
	System.out.println("It is a palindrome number");
}
else
{
	System.out.println("It is not a palindrome number");
}
	}

}
