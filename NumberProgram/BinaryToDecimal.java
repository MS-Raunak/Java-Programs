package NumberProgram;

import java.util.Scanner;

class BinaryToDecimal{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter any binary number:");
		int num = sc.nextInt();
		int powVal=0;
		int decimal = 0;
		
		for(int i=num; i>0; i/=10){
			int digit = i%10;
			decimal = (int) ((double) decimal + digit * Math.pow(2, powVal++)); // 2^0, 2^1, 2^2.....2^n
		}
		
		System.out.print("Decimal(" + num + ") = "  + decimal);
	}
}