package Basics;
import java.util.Scanner;
public class PrimeorComposite 
{

	public static void main(String[] args) 
	{
int num,i,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
num=sc.nextInt();
sc.close();
for(i=0;i<=num/2;i++)
{
	if(num%i==0)
		c++;
}
if(c==2)

	System.out.println("It is a prime number");

else

	System.out.println("It is a composite number");
}

	
}
