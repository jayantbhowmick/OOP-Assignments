package jkhchgjzkj;
import java.util.*;
public abstract class Shape 
{
double a,b;

public abstract double compute_area(double a,double b);
}
class triangle extends Shape
{
	public double compute_area(double a,double b)
	{
		return a*b/2;
	}
}
class rectangle extends Shape
{
	public double compute_area(double a,double b)
	{
		return (a+b)*2;
	}
}
class Mainclass1
{
	public static void main(String[] args)
	{
		int exit=1;
		while(exit==1)
		{
		Shape obj=new triangle();
		Shape obj1=new rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length::");
		double a=sc.nextDouble();
		System.out.println("Enter breadth::");
		double b=sc.nextDouble();
		System.out.println("1.Rectangle   2.Triangle   3.Exit");
		int p=sc.nextInt();
		switch(p)
		{
		case 2:
		   System.out.println("Area of Triangle::"+obj.compute_area(a,b)+"\n\n");
		   break;
		case 1:   
		   System.out.println("Area of Rectangle::"+obj1.compute_area(a,b)+"\n\n");
		   break;
		case 3:
		{
			 System.out.println("Program exited successfully!!!");
			 exit=sc.nextInt();
			 exit=0;
			 break;
		}
	     default:
	    	 System.out.println("Enter valid choice::");
	    	  break;
		}
		}
		
	}
}
