package Basics;

public class ReverseAString2 
{

	public static void main(String[] args) 
	{
		int i;
String str="mohan rao";
char ch[]=str.toCharArray();
for(i=ch.length-1;i>=0;i--)
{
	System.out.print(ch[i]);
}
	}

}
