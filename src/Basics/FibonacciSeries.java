package Basics;
import java.util.Scanner;
public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
int n1=0,n2=1,n3,i,num;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:"+n1 +n2);
num=sc.nextInt();
sc.close();
for(i=2;i<=num;i++)
{
	n3=n1+n2;
	System.out.println(+n3);	
	n1=n2;
	n2=n3;
}

}

}
