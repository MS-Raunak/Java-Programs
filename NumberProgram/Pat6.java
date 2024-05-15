package NumberProgram;

import java.util.Scanner;
/*
class NumberProgram.Pat6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();

		
		for(int r1=1; r1<=size; r1++)
		{
			for(int col=1; col<=r1; col++)
			{
				  System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int r2=1; r2<=size; r2++)          
		{
			for(int col=1; col<=size-r2; col++)
			{
				  System.out.print("* ");
			}
			System.out.println();
		}
				
	}
} 
*/


/*

Enter size:5
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*/

class Pat6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();

		
		for(int r1=1; r1<=size; r1++)
		{
			if(r1<=(size/2)-1)
			{
				for(int col=1; col<=r1; col++)
			    {
				  System.out.print("* ");
			    }
			    System.out.println();
			}
			else{
				for(int col=size-r1; col>=1; col--)
				{
				  System.out.print("* ");
			    }
			    System.out.println();
			}
		}
				
	}
} 