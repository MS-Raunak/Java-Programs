package NumberProgram;

import java.util.Scanner;

class SwapNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a:");
		int a = sc.nextInt();
		System.out.print("enter b:");
		int b = sc.nextInt();
		
		/* Swapping with normal process */
		
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		
	/* Swapping without using 3rd variable */
		
		System.out.print("enter p:");
		int p = sc.nextInt();
		System.out.print("enter q:");
		int q = sc.nextInt();
		
		p = p+q;
		q = p-q;
		p = p-q;
		System.out.println("p:" + p);
		System.out.println("q:" + q);
		
	}
}