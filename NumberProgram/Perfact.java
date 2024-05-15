package NumberProgram;/*
NumberProgram.Perfact num:
6:

6%1==0
6%2==0
6%3==0

1+2+3 = 6


*/


import java.util.Scanner;

class Perfact{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num:");
		int num = sc.nextInt();
		
		int sum =0;
		
		
		for(int i=1; i<=num/2; i++){
			if(num%i==0){
				sum = sum + i;
			}
			
		}
		//System.out.println(sum);
		if(num==sum)
			System.out.println("NumberProgram.Perfact");
		else
			System.out.println("Not NumberProgram.Perfact");
		
			
		
		
	}
}