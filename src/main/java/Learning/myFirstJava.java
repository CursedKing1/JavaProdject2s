package Learning;

import java.util.Scanner;

public class myFirstJava {
    public static void main (String [] args){

        System.out.println("Hello Java");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String firstName = scanner.next();

        System.out.println("Please enter your age: ");

        int userAge = scanner.nextInt();
        System.out.println("Your name is: " + firstName + ".\n"+"Your age is: "+userAge+".");

        if (userAge >=18){
            System.out.println(firstName+ " Can drink");
        }if (userAge < 18){
            System.out.println(firstName+ " Can't drink");
        }if (userAge >=65){
            System.out.println(firstName+ " is retired");
        }
    }
}
