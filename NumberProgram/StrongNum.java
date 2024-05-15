package NumberProgram;/* Strong Numbers:
145:

5!=120
4!=24
1!=1

120+24+1 = 145
*/

import java.util.Scanner;

class StrongNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num:");
		int num = sc.nextInt();
		int sum=0;
		
		for(int i=num; i>0; i/=10){
			int digit = i%10;
			int fact = 1;
			
			for(int j=1; j<=digit; j++){
				fact = fact * j;
			}
			sum = sum+fact;
			
		}
		if(num==sum)
			System.out.println(num + " is a strong number..");
		else
			System.out.println(num + " is not a strong number...");	
		
		
	}
}