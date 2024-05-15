package NumberProgram;

import java.util.Scanner;

class CountDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num:");
		int num = sc.nextInt();
		int count=0;
		
		for(int i=num; i>0; i/=10){
			int digit = i%10;
			count++;
		}
		System.out.println("Total digit in " + num + " = " +count);
	}
}