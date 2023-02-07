package automation.qa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFirstJava {
        public static void main(String[] args) {
            System.out.println("Please enter your first and last name");
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.println("Your name is:" + firstName +lastName);

        System.out.println("Please enter your age");

        int userAge = scanner.nextInt();
        System.out.println("Your age is:"+userAge);

        if (userAge <=18 ){
                System.out.println (firstName + "Too young for drinking");
        }
        if (userAge > 18){
                System.out.println (firstName + "Just right for drinking" );
        }
        if (userAge >=65){
                System.out.println (firstName + "Too old of drinking");
        }


        }
    }
