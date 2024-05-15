package NumberProgram;

import java.util.Scanner;

class ReverseNum{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter number:");
		int num = sc.nextInt();
		int rev = 0;
		
		for(int i=num; i>0; i/=10){
			int remain = i%10;
			rev = (rev*10) + remain;
		}
		System.out.println(rev);
	}
}