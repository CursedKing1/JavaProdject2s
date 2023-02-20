package Lecture44;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password {

    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[!@#$%]).{8,20}$";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                        "2. A password consists of  letters,digits and special character.\n" +
                        "3. A password must contain at least one digits \n" +
                        "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String s = input.nextLine();
    }

    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public static boolean isValid(final String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();

        if isValid(s) {
            System.out.println("This is a valid password");
        }else{
            System.out.println("This is not a valid password");
        }
    }
}






            /*if (is_Valid_Password(s)) {
                System.out.println("Password is valid: " + s);
            } else {
                System.out.println("Not a valid password: " + s);
            }

            public static boolean is_Valid_password(s)){
            if (s.contains("!")){

            }


        }
        /* // here it doesn't need to be static
        public static boolean is_Valid_Password(String password) {

            if (password.length() < PASSWORD_LENGTH){
            return false;
            }

            int charCount = 0;
            int numCount = 0;
            for (int i = 0; i < password.length(); i++) {

                char ch = password.charAt(i);

                if (is_Numeric(ch)) numCount++;
                else if (is_Letter(ch)) charCount++;
                else return false;
            }


            return (charCount >= 2 && numCount >= 2);
        }

        public static boolean is_Letter(char ch) {
            ch = Character.toUpperCase(ch);
            return (ch >= 'A' && ch <= 'Z');
        }


        public static boolean is_Numeric(char ch) {

            return (ch >= '0' && ch <= '9');
        }
        /*public static boolean isSpecialCharacter(char ch){
            return ch = ( '!' || '@' )

        } */



