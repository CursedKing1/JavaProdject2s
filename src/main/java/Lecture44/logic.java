package Lecture44;

import java.util.Scanner;

public class logic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(
                "1.Your password must be no more than 8 digits. \n" +
                        "2.Your password must contain 1 special character \n" +
                        "3.Your password must have 1 digit. \n" +
                        "4.Your password must contain letters \n" +
                        "Input your password. By entering your password you agree to the T&C above:"
        );
        String s = input.nextLine();

        //sum(average(2,3),average(5,10));
        //System.out.println();
    }
}
