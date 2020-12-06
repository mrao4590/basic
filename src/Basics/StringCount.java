package Basics;

public class StringCount 
{

	public static void main(String[] args) 
	{
int i,count=0;
String str="MY NAME IS MOHAN RAO";
for(i=0;i<str.length();i++) 
{
	if(str.charAt(i)!=' ')
count++;
}
System.out.println("The string count is:"+count);
	}

}
