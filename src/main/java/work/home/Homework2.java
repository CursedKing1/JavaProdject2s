package work.home;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        int A = 5, B = 10, C = 15;

        boolean result = false;
        System.out.println(Math.max(A, B));
        if (A > B) {
            if (A > C) {
                System.out.println("A is the largest");
            }
        } else {
            if (B > C) {
                System.out.println("B is the largest");

            } else {
                System.out.println("C is the largest");
            }
        /*}
        if (B > C) {
            System.out.println("B is bigger than C");
        } else {
            System.out.println("C is bigger than B");
        }
        if (C > A) {
            System.out.println("C is bigger than A");
        } else {
            System.out.println("A is bigger than C");
        }*/

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the height of the rectangle");

            double height = scanner.nextDouble();

            System.out.println("Please enter the width of the rectangle");

            double width = scanner.nextDouble();

            //logic for finding the area of the rectangle
            System.out.println("Your area of the rectangle is: " + (height * width));
            //how to calculate them x2
            double res = ((height + width) * 2);
            System.out.println(("Your circumference is: " + res));

            //if (height == 0) {
            if (height % 2 == 0) {
                System.out.println(height + " is and even number");
            } else {
                System.out.println(height + " is and odd number");

            }
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please Enter number 1 to 7 to get equivalent " +
                    "day of the week\n");
            //System.out.println("I am a boy".replaceAll("\\s+","\n"));
            //Kiril Todorov 7:43 PM
            //System.out.println("I\nam\na\nboy");

            int dayOfTheWeek = scanner1.nextInt();
            int day = 0;

            switch (dayOfTheWeek) {
                case 1:
                    dayOfTheWeek = 1;
                    System.out.println("You have selected 1. Day of the week is Monday.");
                    ;
                    break;
                case 2:
                    dayOfTheWeek = 2;
                    System.out.println("You have selected 2. Day of the week is Tuesday.");
                    ;
                    break;
                case 3:
                    dayOfTheWeek = 3;
                    System.out.println("You have selected 3. Day of the week is Wednesday.");
                    ;
                    break;
                case 4:
                    dayOfTheWeek = 4;
                    System.out.println("You have selected 4. Day of the week is Thursday.");
                    ;
                    break;
                case 5:
                    dayOfTheWeek = 5;
                    System.out.println("You have selected 5. Day of the week is Friday.");
                    ;
                    break;
                case 6:
                    dayOfTheWeek = 6;
                    System.out.println("You have selected 6. Day of the week is Saturday.");
                    ;
                    break;
                case 7:
                    dayOfTheWeek = 7;
                    System.out.println("You have selected 7. Day of the week is Sunday.");
                    ;
                    break;

            }
        }
    }
}