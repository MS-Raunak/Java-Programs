package NumberProgram;

import java.util.Scanner;

class SumOfOddEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter n:");
		int n = sc.nextInt();
		
		int oddSum=0;
		int evenSum=0;
		
		
		for(int i=1; i<=n; i++){
			if(i%2==0)
				evenSum+=i;
			else
				oddSum+=i;
		}
		
		System.out.println("Sum Of Even Num = " + evenSum);
		System.out.println("Sum Of Odd Num = " + oddSum);
	}
}