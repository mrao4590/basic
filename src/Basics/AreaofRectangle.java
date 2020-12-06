package Basics;
import java.util.Scanner;
public class AreaofRectangle 
{

	public static void main(String[] args) 
	{
int length,breadth,area;
Scanner sc=new Scanner(System.in);
System.out.println("enter the length:");
length=sc.nextInt();
System.out.println("enter the breadth:");
breadth=sc.nextInt();
sc.close();
area=length*breadth;
System.out.println("Area of rectangle:"+area);

	}

}
