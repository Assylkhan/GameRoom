package com.epam.room;

import com.epam.enums.Age;
import com.epam.toys.Toy;

import java.util.ArrayList;
import java.util.Iterator;

public class GameRoom {
    private ArrayList<Toy> toys = new ArrayList<Toy>();
    private int toysSumm;
    private int allocatedMoney = 500000; // default allocated money

    public void setAllocatedMoney(int maxMoney){
        allocatedMoney = maxMoney;
    }

    public ArrayList<Toy> getToys(){
        return toys;
    }

    public void setToys(ArrayList<Toy> toys){
        for (Toy toy : toys){
            addToy(toy);
        }
    }

    public void addToy(Toy newToy){
//        not add if toys prices are exceed allocated money
        if (toysSumm + newToy.getPrice() > allocatedMoney)
            return;
        toys.add(newToy);
        toysSumm += newToy.getPrice();
    }

    public void removeToy(String name, Age age){
        System.out.println("removing toys by name: " + name + " and by age: " + age);
        for (Iterator<Toy> iter = toys.listIterator(); iter.hasNext(); ){
            Toy toy = iter.next();
            if (toy.getName() == name && toy.getAge() == age){
                iter.remove();
            }
        }
    }

    public int getSumm(){
        int summ = 0;
        for (Toy toy : toys)
            summ += toy.getPrice();
        return summ;
    }
}
