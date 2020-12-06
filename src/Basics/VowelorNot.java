package Basics;
import java.util.Scanner;
public class VowelorNot 
{

	public static void main(String[] args) 
	{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter the character:");
ch=sc.next().charAt(0);
sc.close();
switch(ch)
{
case 'A':
case 'a':
case 'E':
case 'e':
case 'I':
case 'i':
case 'O':
case 'o':
case 'U':
case 'u':
	System.out.println("It is a vowel");
	break;
	default:
		System.out.println("It is not a vowel");
}
	}

}
