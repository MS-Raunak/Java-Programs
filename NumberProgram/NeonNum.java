package NumberProgram;/*

9^2 = 81 =8+1=9
*/
import java.util.Scanner;

class NeonNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number:");
		int num = sc.nextInt();
		
		int sum=0;
		
		double power = (double) Math.pow(num,2);
		
		for(double i=power; i>0; i/=10){
			sum += i%10;
		}
		if(num==sum){
			System.out.println(num + " is a Neon number..");
		}
		else
			System.out.println(num + " is not a Neon number..");
		
		
	}
} 