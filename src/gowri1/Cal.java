package gowri1;
import java.util.*;
public class Cal {

	public static int Add(int a,int b)
	{
	return a+b;
	}
	public static int Sub(int a,int b)
	{
	return a-b;
	}
	public static int Mul(int a,int b)
	{
	return a*b;
	}
	public static int Div(int a,int b)
	{
	return a/b;
	}
	public static void main(String argd[])
	{
	Scanner sc=new Scanner(System.in);
	boolean flag=false;
	System.out.println("----simple calculator----");
	while(true)
	{
	System.out.println("enter first number");
	int a=sc.nextInt();
	System.out.println("enter second number");
	int b=sc.nextInt();
	System.out.println("1.Add\t2.Sub\t3.Mul\t4.Div");
	System.out.println("enter your choice");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:System.out.println("Addition"+Add(a,b));
	       break;
	case 2:System.out.println("Subtraction"+Sub(a,b));
	       break;
	case 3:System.out.println("Multiplication"+Mul(a,b));
	       break;
	case 4:System.out.println("Division"+Div(a,b));
	       break;
	case 5:System.out.println("Invalid");
	       flag=true;
	       return;
	}
	}







	}
}
