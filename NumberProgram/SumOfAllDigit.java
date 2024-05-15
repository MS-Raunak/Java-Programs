package NumberProgram;/* Strong Numbers:
145:

1+4+5 = 10

*/

import java.util.Scanner;

class SumOfAllDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num:");
		int num = sc.nextInt();
		
		int concatNum = 0;
		int sum=0 , n=0,i;
		
		for(i=num; i>n; i/=10){
			int digit = i%10;
			concatNum = (concatNum*10) + digit;
			
		}
		
		
		for(i=concatNum; i>n; i/=10){
			int digit = i%10;
			if(digit > n+9)
				System.out.print(digit + "+");
			else
				System.out.print(digit + " ");
			sum = sum + digit;
		}
		System.out.println(":"+sum);
		
	}
}