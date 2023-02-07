package data.types;

public class JavaActions {
    public static void main(String[] args) {
        String testString ="My Test String";
        System.out.println(testString.charAt(0));
        System.out.println(testString.contains("stri"));
        System.out.println(testString.equals("random string"));
        System.out.println(testString.length());
        String [] springArray= testString.split(" ");
        System.out.println( testString + " has " + springArray.length + " words.");
        System.out.println(String.format("%s has %d words.",testString,springArray.length));
        System.out.printf("%s has %d words.",testString,springArray.length);
    }
}
