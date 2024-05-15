package NumberProgram;

import java.util.Scanner;

/*
Reversing the given number without 0
EX: 1230

o/p:321
count: 3
 */

class ReverseNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		
		int revNum=0;
		int count=0;
		
		for(int i=num; i>0; i/=10){
			int digit = i%10;
			if(digit>0){
				revNum = (revNum*10) + digit;
			}
		}
		System.out.println("Reverse Number:" + revNum);
		for(int j=revNum; j>0; j/=10){
			count++;
		}
		System.out.println("Total digit(" + revNum +")= " + count);
	}
}