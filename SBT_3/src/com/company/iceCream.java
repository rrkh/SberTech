package com.company;

import java.util.ArrayList;

/**
 * Created by dmitr on 10.11.2016.
 */
public class iceCream {
    private int price;
    private String typeCream;
    private String cupCream;
    private ArrayList<String> toppingList = new ArrayList();

    public ArrayList<String> getToppingList() {
        return toppingList;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeCream() {
        return typeCream;
    }

    public void setTypeCream(String typeCream) {
        this.typeCream = typeCream;
    }

    public String getCupCream() {
        return cupCream;
    }

    public void setCupCream(String cupCream) {
        this.cupCream = cupCream;
    }

    public void setToppingList(ArrayList<String> toppingList) {
        this.toppingList = toppingList;
    }


    public iceCream() {
        this.cupCream = "Рожок";
        this.price = 0;
        this.typeCream = "Сливочное";
    }

    int price() {
        int priceValue = 0;
        if (this.cupCream.equals("Рожок")) {
            priceValue += 100;
        } else if (this.cupCream.equals("Стаканчик")) {
            priceValue += 150;
        } else priceValue = 0;
        for (int i = 0; i < this.toppingList.size(); i++) {
            if (this.toppingList.get(i).toString().equals("Орешки")) {
                priceValue += 30;
            } else if (this.toppingList.get(i).equals("Шоколад")) {
                priceValue += 20;
            } else if (this.toppingList.get(i).equals("Конфетки")) {
                priceValue += 15;
            } else if (this.toppingList.get(i).equals("Варенье")) {
                priceValue += 10;
            } else priceValue += 0;


        }
        setPrice(priceValue);
        return priceValue;
    }

    public void printIceCream() {
        System.out.println("Вы набрали на сумму: " + price + "\n Вкус: " + typeCream + "\n Посуда: " + cupCream + "\n Топпинги: ");
        for (int i = 0; i < toppingList.size(); i++) {
            System.out.println(toppingList.get(i));

        }
    }

}
