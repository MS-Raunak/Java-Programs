package assesment.exception;

import java.util.Scanner;


public class EmailLogin{
    public static void main(String[] args) {
        String email = "rk@gmail.com";
        long password = 1234;

        Scanner sc = new Scanner(System.in);
        System.out.print("enter email: "); String input_email = sc.next();
        System.out.print("enter password: "); long input_password = sc.nextLong();

        if (input_email.equals(email)) {
            if (password==input_password){
                System.out.println("Welcome!");
            }
            else {
                try {
                    throw new CheckedException("Good to see my Custom Exception");
                }
                catch (CheckedException e){
                    e.printStackTrace();
                    e.getMessage();
                }
            }
        }
        else {
            try {
                throw new CheckedException();
            }
            catch (CheckedException e){
                e.printStackTrace();
                e.getMessage();
            }

        }
    }
}
