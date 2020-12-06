package Basics;
import java.util.Scanner;
public class PowerofaNumber 
{

	public static void main(String[] args) 
	{
int num,exponent;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
num=sc.nextInt();
System.out.println("enter the exponent:");
exponent=sc.nextInt();
sc.close();
double result=Math.pow(num, exponent);
System.out.println("The power of a number is:"+result);
}

}
