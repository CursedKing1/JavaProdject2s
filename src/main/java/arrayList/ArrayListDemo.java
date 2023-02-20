package arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    //unlike array where we print only with cycles here we can
    // print with sout and it will print the parameter not the location
    // ****BENEFITS**** everything in arrayList is accessed with the same speed size doesn't matter
    // ****C**** adding or removing elements it's extremely long process unless if it's at the end of the list
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Sofia");
        cities.add(0,"Varna");
        cities.add("London");

        System.out.println("Cities before brexit are: " + cities);
        cities.remove("London");
        System.out.printf("Cities after brexit are: %s%n", cities);

        cities.remove(0);
        System.out.printf("But the first is : %s%n",cities);
        System.out.println(cities.indexOf("Sofia"));


    }
}
