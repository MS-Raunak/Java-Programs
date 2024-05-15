package NumberProgram;

import java.util.Scanner;

class Pat12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();
		
		for(int i=1; i<=size; i++){
			for(int space=1; space<=size-i; space++) System.out.print(" ");
			for(int j=1; j<=5; j++){
				if(j==i || j==size ) System.out.print(" ");
				else System.out.print("*");
			}
		}
	}
}