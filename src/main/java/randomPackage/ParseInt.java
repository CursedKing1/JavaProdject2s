package randomPackage;

import java.util.Scanner;

public class ParseInt {
    public static void main(String[] args) {
        int [] textArray = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < textArray.length ; i++) {

            System.out.println("Please enter number");
            textArray[i] =Integer.parseInt(scanner.nextLine());
            System.out.println(textArray);
        }
    }
}
