package Basics;
import java.util.Scanner;
public class AreaofSquare 
{

	public static void main(String[] args) 
	{
int side,area;
Scanner sc=new Scanner(System.in);
System.out.println("enter the side:");
side=sc.nextInt();
sc.close();
area=side*side;
System.out.println("Area of square:"+area);
	}

}
