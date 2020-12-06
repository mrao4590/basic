package Basics;

public class ReversingaString 
{

	public static void main(String[] args) 
	{
int i;
String str="kolla";
String rev="";
for(i=str.length()-1;i>=0;i--)
{
	rev=rev+str.charAt(i);
}
System.out.println("The original string is:"+str);
System.out.println("The reversed string is:"+rev);
	}

}
