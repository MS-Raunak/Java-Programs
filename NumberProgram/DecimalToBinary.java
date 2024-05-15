package NumberProgram;

import java.util.Scanner;

class DecimalToBinary{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any decimal number:");
		int num = sc.nextInt();

		String binary = "";

		for (int i = num; i > 0; i /= 2) {
			int r = i % 2;
			binary = r + binary;
		}
		System.out.println("Binary:" + binary);


	}
}