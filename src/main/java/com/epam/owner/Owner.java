package com.epam.owner;

import com.epam.factory.ToysFactory;
import com.epam.room.GameRoom;
import com.epam.toys.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Owner {

    public ArrayList<Toy> sortByPrice(ArrayList<Toy> toys){
        System.out.println("sort toys by price");
        Collections.sort(toys, new Comparator<Toy>() {
            @Override
            public int compare(Toy o1, Toy o2) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
        });
        return toys;
    }
    public ArrayList<Toy> sortByName(ArrayList<Toy> toys){
        System.out.println("sort toys by name");
        Collections.sort(toys, new Comparator<Toy>() {
            @Override
            public int compare(Toy o1, Toy o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return toys;
    }

    private GameRoom gameRoom = new GameRoom();
    public GameRoom getRoom(){
        return gameRoom;
    }

    public static ArrayList<Toy> Select(ArrayList<Toy> toys, int priceFrom, int priceUntil) {
        System.out.println("Selecting toys by price from - " + priceFrom + " until - " + priceUntil);
        ArrayList<Toy> foundToys = new ArrayList<Toy>();
        for (Toy toy : toys)
            if (priceFrom < toy.getPrice() && priceUntil > toy.getPrice())
                foundToys.add(toy);
        return foundToys;
    }

    public void prepareRoom(int toyCount, int allocatedMoney) {
        ToysFactory factory = new ToysFactory();
        gameRoom.setToys(factory.create(40));
        gameRoom.setAllocatedMoney(allocatedMoney);
    }


}
