package com.company;

/**
 * Created by dmitr on 22.11.2016.
 */
public class Viking implements Warrior {
    private int Damage = 10;
    private int Health = 70;
    private boolean life = true;
    private String squadName;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Viking(String name, String sqName) {
        this.squadName = sqName;
        this.name = name;
    }

    @Override
    public int attack() {
        return Damage;
    }

    @Override
    public void takeDamage(int Damage) {
        Health -= Damage;
        if (Health <= 0) {
            life = false;
        }
    }

    @Override
    public boolean isAlive() {
        return life;
    }

    @Override
    public void setSquadName(String Name) {
        squadName = Name;
    }

    public String getSquadName() {
        return squadName;
    }

    @Override
    public String toString() {
        return name + "\n Класс: Викинг \n Название отряда:" + squadName;
    }

    @Override
    public Object clone() {
        try {
            Viking e = (Viking) super.clone();
            e.name = e.getName();
            e.squadName = e.getSquadName();
            return e;
        } catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
}
