//package studentWork.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ShoppingList {

    public static void main(String[] args) {

        ArrayList <String> shoppingList = new ArrayList<String>();

        String box = "Wheaties";

        shoppingList.add(box);

        shoppingList.add("bananas");

        shoppingList.set(1, "Bananas");

        shoppingList.remove(0);

        shoppingList.add("Eggs");

        shoppingList.add("Apples");

        //shoppingList.clear();

        System.out.println(shoppingList);
        System.out.println("There are " + shoppingList.size() + " in the list");

        System.out.println(shoppingList.toString());

        System.out.println("Before sort, items = " + shoppingList);
        Collections.sort(shoppingList);
        System.out.println("After sort, items = " + shoppingList);

    }


}