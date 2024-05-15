package NumberProgram;/*
20
21
22
23
24
*/

import java.util.Scanner;
/*
class NumberProgram.SumUptoSingleDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number:");
		int num = sc.nextInt();
		int sum=0;
		
		do{
			while(num>0){
				sum+= num%10;
				num/=10;
			}
			System.out.println(sum);
			num = sum;
			sum = 0;
		}while(num>9);
		
		
	}
} */

/* Second Method */
class SumUptoSingleDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number:");
		int num = sc.nextInt();
		int sum=0;
		
		while(num>0){
			sum+=num%10;
			num/=10;
			
			if(num==0 && sum>=9){
				System.out.println(sum);
				num = sum;
				sum=0;
			}
			System.out.println(sum);
		}
		
		
	}
} 