package NumberProgram;

import java.util.Scanner;

class XPattern {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter row size:");
		int size = sc.nextInt();
		
		for(int i=1; i<=size; i++){
			for(int j=1; j<=size; j++){
				if(i==j || j==(size+1)-i ) System.out.print("*" + " ");
				else System.out.print(" " + " ");
			}
			System.out.println();
		}
	}
}

/*
Enter row size:5
X   X
 X X
  X
 X X
X   X


Enter row size:6
X    X
 X  X
  XX
  XX
 X  X
X    X


*/