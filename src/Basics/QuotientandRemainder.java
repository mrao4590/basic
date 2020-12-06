package Basics;
import java.util.Scanner;
public class QuotientandRemainder 
{

	public static void main(String[] args) 
	{
int quotient,remainder,dividend,divisor;
Scanner sc=new Scanner(System.in);
System.out.println("enter a dividend:");
dividend=sc.nextInt();
System.out.println("enter the divisor:");
divisor=sc.nextInt();
sc.close();
quotient=dividend/divisor;
remainder=dividend%divisor;
System.out.println("Quotient is:"+quotient);
System.out.println("Remainder is:"+remainder);
	}

}
