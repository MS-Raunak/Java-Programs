package NumberProgram;

import java.util.Scanner;

class Pat3
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the row size:");
		int size = sc.nextInt();
		
		for(int row=1; row<=size; row++){
			for(int col=1; col<=row; col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}

/*
Enter the row size:
5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/