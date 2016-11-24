package com.company;

import java.security.PublicKey;

/**
 * Created by dmitr on 24.11.2016.
 */
public class ToppingSelected {
    public static String CreamSelected(int k) {
        if (k == 1) {
            return "Сливочное";
        } else if (k == 2) {
            return "Клубничное";
        } else {
            return "Шоколадное";
        }

    }
    public static iceCream ToppingSelected(int z,iceCream iceCream)
    {
        if (z <= 1) {
            iceCream.getToppingList().add("Орешки");
        } else if (z == 2) {
            iceCream.getToppingList().add("Шоколад");
        } else if (z == 3) {
            iceCream.getToppingList().add("Конфетки");
        } else if (z == 4) {
            iceCream.getToppingList().add("Варенье");
        } else if (z == 5) {

//            iceCream.setToppingList(toppingList);
            iceCream.printIceCream();
//            bol = true;
        }
        return  iceCream;
    }
}
