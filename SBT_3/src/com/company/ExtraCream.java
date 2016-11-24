package com.company;

import java.util.ArrayList;

/**
 * Created by dmitr on 11.11.2016.
 */
public class ExtraCream extends iceCream {

    private String drink;

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public void setToppingList(ArrayList<String> toppingList) {
        System.out.println("Топпинги сюда нельзя добавлять!");
    }

    public ExtraCream() {
        super();
    }


    @Override
    public void printIceCream() {
        System.out.println("Вы набрали на сумму: " + getPrice() + "\n Вкус: " + getTypeCream() + "\n Посуда: " + getCupCream() + "\n Напиток: " + getDrink());
    }


    public int price() {
        int priceValue = 0;
        if (super.getCupCream().equals("Рожок")) {
            priceValue += 100;
        } else if (super.getCupCream().equals("Стаканчик")) {
            priceValue += 150;
        } else {
            priceValue = 0;
        }

        if (this.drink.equals("Морсик")) {
            priceValue += 40;
        } else if (this.drink.equals("Компотик")) {
            priceValue += 35;
        } else if (this.drink.equals("Квас")) {
            priceValue += 50;
        } else {
            priceValue += 0;
        }
        setPrice(priceValue);
        return priceValue;
    }


}
