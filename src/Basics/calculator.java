package Basics;
import java.util.Scanner;
public class calculator 
{

	public static void main(String[] args) 
	{
double first,second,result;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
first=sc.nextDouble();
second=sc.nextDouble();
System.out.println("enter an operator:(+,-,*,/");
char operator=sc.next().charAt(0);
switch(operator)
{
case '+':
	result=first+second;
	break;
case '-':
	result=first-second;
	break;
case '*':
	result=first*second;
	break;
case '/':
	result=first/second;
	break;
	default:
		System.out.printf("you entered wrong operator");
		return;
	
}
System.out.printf("%lf %c %lf=%lf",first,second,result,operator);
	}

}
