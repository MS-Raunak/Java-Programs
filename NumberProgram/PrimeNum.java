package NumberProgram;

import java.util.Scanner;

class PrimeNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num:");
		int num = sc.nextInt();
		
	    boolean flag = true;
		
		if(num>1){
			for(int i=2; i<=num/2; i++){
				if(num%i==0){
					flag = false;
				}
			}
			if(flag)
				System.out.println(num + " is a prime number..");
			else
				System.out.println(num + " is not a prime number...");
		}
		else
		{
			System.out.println(num + " is not a prime number..");
		}
		
	}
}