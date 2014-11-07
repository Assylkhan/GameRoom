package com.epam.room;

import com.epam.enums.Age;
import com.epam.toys.Toy;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * created by Assylkhan Rakhatov on 07.11.2014
 */
public class GameRoom {
    private ArrayList<Toy> toys = new ArrayList<Toy>();
    private int toysSumm;
    private int allocatedMoney = 500000; // default allocated money

    /**
     *
     * @param maxMoney
     */
    public void setAllocatedMoney(int maxMoney){
        allocatedMoney = maxMoney;
    }

    /**
     *
     * @return toys
     */
    public ArrayList<Toy> getToys(){
        return toys;
    }

    /**
     *
     * @param toys
     */
    public void setToys(ArrayList<Toy> toys){
        for (Toy toy : toys){
            addToy(toy);
        }
    }

    /**
     *
     * @param newToy
     */
    public void addToy(Toy newToy){
//        not add if toys prices are exceed allocated money
        if (toysSumm + newToy.getPrice() > allocatedMoney)
            return;
        toys.add(newToy);
        toysSumm += newToy.getPrice();
    }

    /**
     *
     * @param name
     * @param age
     */

    public void removeToy(String name, Age age){
        System.out.println("removing toys by name: " + name + " and by age: " + age);
        for (Iterator<Toy> iter = toys.listIterator(); iter.hasNext(); ){
            Toy toy = iter.next();
            if (toy.getName() == name && toy.getAge() == age){
                iter.remove();
            }
        }
    }

    /**
     *
     * @return summ of all toy prices
     */
    public int getSumm(){
        int summ = 0;
        for (Toy toy : toys)
            summ += toy.getPrice();
        return summ;
    }
}
