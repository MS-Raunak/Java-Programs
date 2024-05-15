package assesment.exception;

import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age: "); int age = sc.nextInt();

        if (age > 18){
            System.out.println("You can vote");
        }
        else {
            throw new UnCheckedException("Wow I sent the exception");
        }
    }
}
