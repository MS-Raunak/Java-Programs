package NumberProgram;

import java.util.Scanner;

class Palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num:");
		int num = sc.nextInt();
		
		int rev = 0;
		
		
		if(num>9){
			for(int i=num; i>0; i/=10){
			int digit = i%10;
			rev = (rev*10) + digit;
			}
		
			//System.out.println("Reverse Num:" + rev);
			
			if(num==rev)
				System.out.println(num + " is a NumberProgram.Palindrome number...");
			else
				System.out.println(num + " is Not a NumberProgram.Palindrome number...");
		}
		else
			System.out.println("Please enter valid number:");
	}
}