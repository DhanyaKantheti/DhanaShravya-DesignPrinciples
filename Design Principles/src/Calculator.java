import java.util.*;
public class Calculator {
	public static void add(int a,int b)
	{
		System.out.println("Sum:"+(a+b));
	}
	public static void subtract(int a,int b)
	{
		System.out.println("Difference: "+(Math.abs(a-b)));
	}
	public static void multiply(int a,int b)
	{
		System.out.println("Product: "+(a*b));
	}
	public static void divide(int a,int b)
	{
		System.out.println("Quotient: "+(a/b));
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a choice:");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		int choice=sc.nextInt();
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(choice)
		{
		case 1:
			add(a,b);
			break;
		case 2:
			subtract(a,b);
			break;
		case 3:
			multiply(a,b);
			break;
		case 4:
			divide(a,b);
			break;
		}
		
		
	}
}
