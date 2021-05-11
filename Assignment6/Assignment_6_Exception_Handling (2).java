package abhishekkkkk;

import java.util.Scanner;

class division
{
	protected String n1,n2;
	protected int num1,num2;
	
	Scanner sc=new Scanner(System.in);
	
	public void read_and_display_division()
	{
		System.out.print("\nEnter maximum size of array : ");
		int size=sc.nextInt();
		division[] array=new division[size];
		
		System.out.print("\nEnter number of Dividend-divisor pairs to be added in array(less than maximum size of array) : ");
		int num_of_elements=sc.nextInt();
		for(int i=0;i<num_of_elements;i++)
		{
			array[i]=new division();
			
			System.out.print("\nEnter the Dividend(integer) : ");
			array[i].n1=sc.next();
			array[i].num1=Integer.parseInt(array[i].n1);
			
			System.out.print("Enter the divisor(integer) : ");
			array[i].n2=sc.next();
			array[i].num2=Integer.parseInt(array[i].n2);
			
			System.out.print("Division answer : "+array[i].divide()+"\n");
		}
		System.out.print("\nThank you. Application ended.");
	}
	
	public float divide()
	{
		float div=num1/num2;
		return div;
	}
	
	public void exception() throws ArithmeticException
	{
		try
		{
			read_and_display_division();
		}
		
		catch(ArithmeticException a)
		{
			throw new ArithmeticException();
		}
		
		catch(NumberFormatException n)
		{
			throw new NumberFormatException();
		}
		
		catch(ArrayIndexOutOfBoundsException i)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		
	}
	
}

public class Assignment_6_Exception_Handling {

	public static void main(String[] args) {
		
		System.out.print("\nWELCOME TO THE APPLICATION!!!\n");
	
		division d=new division();
		
		int check=0;
		
		try
		{
			d.exception();
		}
		
		catch(ArithmeticException a)
		{
			System.out.println("\nPlease enter correct divisor. Divisor can't be zero.The error is :"+a);
			check--;
		}
		
		catch(NumberFormatException n)
		{
			System.out.println("\nPLease enter integers.Dividend and divisor have to be integers.The error is :"+n);
			check--;
		}
		
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println("\n\nArray size exceeded.Number of elements can't exceed the maximum size of array.The error is :"+i);
			check--;
		}
		
		finally
		{
			if(check!=0)
			{
			System.out.println("\nOops!\nApplication ended due to invalid input given by user.");
			}
		}
	}
}

