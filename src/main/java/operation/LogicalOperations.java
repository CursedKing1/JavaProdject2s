package operation;

public class LogicalOperations {
    public static void main(String[] args) {


         /*  Logical && - if two of the operators are true it will result true
        if only one is false it will execute false

            Logical or || - only one needs to be true to execute true
            Logical not ! - turns the logic
             */

        int logicalNumber = 5, logicalNumber2 = 10;

        boolean result = false;

        //Logical Not !
        System.out.println("Your ! logical NOT result is:"+!result);
        // true && true = true
        result = (logicalNumber < logicalNumber2) && !(logicalNumber > logicalNumber2);
        System.out.println(result);

        // true && false = false
        result = (logicalNumber < logicalNumber2) && (logicalNumber > logicalNumber2);
        System.out.println("Your && or so called logical equal false or true result is: "+result);

        // false && false = false
        result = (logicalNumber > logicalNumber2) || !(logicalNumber < logicalNumber2);
        System.out.println("Your || or so called Or result is: "+ result);

    }
}