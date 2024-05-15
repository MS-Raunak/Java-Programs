package NumberProgram;

import java.util.Scanner;
// LCM means the minimum or least value which is divisible by all the given numbers.
class LCM_HCF {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a & b:");
		int a = sc.nextInt();// 5
		int b = sc.nextInt();// 6
		int c;

		int min = (a < b) ? a : b;

		// LCM
		for(int i=min; ; i++){
			if(i%a==0 && i%b==0){ 
				System.out.println("LCM (" + a + "," + b + ") = " + i );
				break;
			}
			
		}

		// HCF: At this moment not printing correct answer

		System.out.println("Enter num1 & num2");
		int p = sc.nextInt();
		int q = sc.nextInt();
		int hcf = 1;
		int temp = (p<q ) ? p:q;

		for (int i = 1; i <= temp; i++) {
			if (p % i == 0 && q % i == 0) {
				hcf = i;
			}
		}

		System.out.println("HCF(" + p + "," + q + ") = " + hcf);



		
	}
}

/*
LCM
========

EX(1): a=2, b=8
2%2=0, 3%2!=0, 4%2=0, 5%2!=0, 6%2=0, 7%2!=0, 8%2=0 break
2%8!=0,3%8!=0, 4%8!=0,5%8!=0, 6%8!=0,7%8!=0, 8%8=0 break
here 8 is the least value that is divisible by both 2 and 8

EX(1): a=2, b=3
2%2=0, 3%2!=0, 4%2=0, 5%2!=0, 6%2=0 break
2%3!=0,3%3=0, 4%3!=0,5%3!=0, 6%3=0 break
here 6 is the least value that is divisible by 2 and 3

ALGORITHM:
1: Enter two number 'a' and 'b'
2: if 'a' is minimum value then start loop with i=a till the infinite condition
3: if 'b' is minimum value then start loop with i=b till the infinite condition
4: within the loop: a%i==0 && a%b==0 or b%i==0 && b%a==0 then break the loop and print 'i'
5: if condition is not matched continue the loop until 'i' got divisible by both a and b.

 */

/*
HCF
=====
1: Start: a = 48, b = 18
2: First iteration: Divide 48 by 18, remainder is 12. Now, a = 18, b = 12
3: Second iteration: Divide 18 by 12, remainder is 6. Now, a = 12, b = 6
4: Third iteration: Divide 12 by 6, remainder is 0. Now, a = 6, b = 0
5: Since the remainder is now 0, the algorithm terminates, and the HCF/GCD is 6.

So, the HCF/GCD of 48 and 18 is 6.
 */

