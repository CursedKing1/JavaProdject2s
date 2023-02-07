package operation;



public class EqualOperations {
    public static void main(String[] args) {
        printDayOfTheWeek(1);
        printNumberOfDaysInTheMonth(2,2019);

        int firstNumber = 5, secondNumber = 10;

        //equals
        System.out.println(firstNumber == secondNumber);
        //not equals
        System.out.println(firstNumber != secondNumber);
        System.out.println(firstNumber > secondNumber);


        int C = firstNumber + secondNumber;

        System.out.println("The sum is : " + C + 20);

        // with += we add one more time the fist number
        C += firstNumber;
        System.out.println("The sum is : " + C + 20);

        //Numbers should be at the front if + needs to be calculated
        System.out.println(10 + 20 + " Java Radko example");
        System.out.println(10 + 20 + "Javatpoint" + 10 + 20 + " Javatpoint");

        System.out.println("Operation if is starting ");
        /* if for anything with two results the code is:
         A >,=,eg. B ? "if true that will print" : "if false that will print"
         */
        System.out.println(firstNumber == secondNumber ? "Numbers are equal" : "Numbers are not equal");

        //If operators !!!
        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equal");
            System.out.println(C);
            System.out.println(C + firstNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println("Numbers are not equal");
            System.out.println(C + secondNumber);
        } else {
            System.out.println("Second is greather");
            System.out.println(secondNumber - firstNumber);

        }
    }
        /* Switch construction much faster than IF but only works with certain set of data
        We always needs to have Break; after each case
         */

    public static void printDayOfTheWeek(int dayOfTheWeek) {
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Selected day is Monday");
                break;
            case 2:
                System.out.println("Selected day is Tuesday");
                break;
            case 3:
                System.out.println("Selected day is Wednesday");
                break;
            default:
                System.out.println("Not Correct Option");
        }

    }

    public static void printNumberOfDaysInTheMonth(int month, int year) {

        int numberOfDays = 0;
        switch (month) {
            case 1:
                numberOfDays = 31;
                System.out.println("The option you've selected has: " + numberOfDays);
                ;
                break;
            case 2:
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                numberOfDays = 29;
                System.out.println("You have selected February and it has: " + numberOfDays);
            }  else {
                numberOfDays = 28;
                System.out.println("You have selected February and it has: " + numberOfDays);
            }
            break;

             default:
                System.out.println("Invalid Data");

        }
    }
}
