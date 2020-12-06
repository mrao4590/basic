package Basics;
import java.util.Scanner;
public class first10multiplesofano 
{

	public static void main(String[] args) 
	{
int i,num;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
num=sc.nextInt();
System.out.println("first 10 multiples of the number:");
sc.close();
for(i=1;i<=10;i++)
{
	
	System.out.println(+num*i);
}

	}

}
