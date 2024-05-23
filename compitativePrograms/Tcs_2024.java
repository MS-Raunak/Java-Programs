package compitativePrograms;

import java.util.Scanner;

/**
 * Asked in TCS-2024
 * There are group of girls and there are some pens and pencils
 * our task is that we need to distribute pens and pencils among the girls equally.
 * input:
 * girls: 2
 * pens: 4
 * pencils: 4
 *
 * output:
 * Girl1: {pencils: 2, pens: 2}
 * Girl2: {pencils: 2, pens: 2}
 */
public class Tcs_2024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of girls in a group: ");
        int girls = sc.nextInt();

        System.out.print("enter number of pencils: ");
        int pencils = sc.nextInt();

        System.out.print("enter number of pen: ");
        int pens = sc.nextInt();

        if (pencils%girls==0 && pens%girls==0) {
            int pencilsPerGirl = pencils/girls;
            int pensPerGirl = pens/girls;
            for (int i=1; i<=girls; i++) {
                System.out.println("Girl" + i + ": {pencils: " + pencilsPerGirl + ", pens: " + pensPerGirl + "}");

            }
        }
        else {
            System.out.println("Can't distribute pen and pencil equally");
        }
    }
}
