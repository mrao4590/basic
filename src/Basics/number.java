package Basics;

public class number {

	public static void main(String[] args) 
	{
		double d= 234.12413;
		String text = Double.toString(Math.abs(d));
		int integerPlaces = text.indexOf('.');
		int decimalPlaces = text.length() - integerPlaces - 1;
	
}
}