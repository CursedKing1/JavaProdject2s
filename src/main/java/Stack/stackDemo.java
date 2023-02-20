package Stack;

import java.util.Stack;

public class stackDemo {
    public static void main(String[] args) {

        Stack<String>kitchenDrawer = new Stack<String>();

        kitchenDrawer.push("Pan");
        kitchenDrawer.push("Dish");
        kitchenDrawer.push("Fork");

        System.out.println(kitchenDrawer);
        System.out.println(kitchenDrawer.pop());
        System.out.println(kitchenDrawer.pop());
        System.out.println(kitchenDrawer);

        kitchenDrawer.add(0,"Tawel");//not a normal stack operation
        // this is list operation
        System.out.println(kitchenDrawer);

    }
}
