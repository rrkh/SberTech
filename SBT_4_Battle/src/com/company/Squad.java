package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dmitr on 22.11.2016.
 */
public class Squad implements Cloneable {
    private String NameSquad;
    private ArrayList<Warrior> massWarior;

    public ArrayList<Warrior> getMassWarior() {
        return massWarior;
    }

    public void setMassWarior(ArrayList massWarior) {
        this.massWarior = massWarior;
    }


    public Squad(String NameSquad)
    {
        this.NameSquad=NameSquad;
    }


    public Warrior getRandomWarior() {
        Random r=new Random();
        return massWarior.get(r.nextInt(massWarior.size()));
    }

    public  boolean hasAliveWariors ()
    {
        int j=0;
        for (int i = 0; i <massWarior.size() ; i++) {
            if(massWarior.get(i).isAlive()){j++;}
            else
                {
                    System.out.println("Боец "+massWarior.get(i).toString()+"\n погиб!!!");
                massWarior.remove(i);
            }
        }
        if(j!=0){return true;}
        else return false;
    }

    @Override
    public String toString() {
        return NameSquad;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //скопировали объект
        Squad cloneSq=(Squad)super.clone();
        //создали новый массив с бойцами
        ArrayList<Warrior> br=new ArrayList<>();

        for (int i = 0; i <cloneSq.getMassWarior().size() ; i++) {
            //получили ссылку у клона на бойца, и присвоили ее новому объекту
            Warrior wr=cloneSq.getMassWarior().get(i);

            if( wr instanceof BarbarianJulia){
                BarbarianJulia e=(BarbarianJulia)((BarbarianJulia) wr).clone();
                br.add(e);
            }

            //добавили нового бойца в новый массив...но при этом новый боец содержит ссылку на старого...бред, я запутался.
        }
        //заменили массив с бойцами (ссылку)
        cloneSq.setMassWarior(br);

        return cloneSq;
    }
}
