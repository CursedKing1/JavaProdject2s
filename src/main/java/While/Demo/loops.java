package While.Demo;

public class loops {
    public static void main(String[]args){
        int number = 0;

        while (number <2 ){
            System.out.println("Current number is: "+ number);
            number++;
        }
        calculateFactorial(0);
        calculateFactorial(1);
        calculateFactorial(4);
    }
    public static void calculateFactorial(int number) {
        int factorial = 1;
        int iterator = number;
        //if we make the statement (true) we make it endless
        while (iterator > 0) {

            factorial *= iterator;
            //if we remove next line we make it endless
            iterator--;
        }
        System.out.printf("You have entered: %d. " +
                "Factorial is: %d\n", number,factorial);
    }
}
