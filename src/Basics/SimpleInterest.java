package Basics;
import java.util.Scanner;
public class SimpleInterest 
{

	public static void main(String[] args) 
	{
float amount,rate,time,ans;
Scanner sc=new Scanner(System.in);
System.out.println("enter the amount:");
amount=sc.nextFloat();
System.out.println("enter the rate:");
rate=sc.nextFloat();
System.out.println("enter the time:");
time=sc.nextFloat();
ans=(amount*rate*time)/100;
System.out.println("Simple interest is:"+ans);
sc.close();

	}

}
