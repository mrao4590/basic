package Basics;
import java.util.Scanner;
public class AreaofCircle 
{

	public static void main(String[] args) 
	{
double pi=3.14,radius,area;
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius:");
radius=sc.nextDouble();
sc.close();
area=pi*radius*radius;
System.out.println("Area of circle is:"+area);
	}

}
