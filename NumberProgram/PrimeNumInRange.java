package NumberProgram;

import java.util.Scanner;

class PrimeNumInRange{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter range:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if(a>b) System.out.println("Please enter valid range...");
		
		for(int i=a; i<=b; i++){
			
			boolean flag = true;
			
			if(i>1 && b > 1) {
				for(int j=2; j<=i/2; j++){
					if(i%j==0) flag = false;
				}
				if(flag) System.out.println(i + " is prime number..");
			}
		}
		
		
	}
}