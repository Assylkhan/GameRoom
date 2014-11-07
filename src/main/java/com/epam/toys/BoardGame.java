package com.epam.toys;

import com.epam.enums.Age;
import com.epam.enums.Size;

/**
 * created by Assylkhan Rakhatov on 07.11.2014
 */
public class BoardGame extends Toy{
    private int playerCount;

    /**
     *
     * @param name
     * @param price
     * @param size
     * @param age
     * @param playerCount
     */
    public BoardGame(String name, int price, Size size, Age age, int playerCount){
        super(name, price, size, age);
        this.playerCount = playerCount;
    }

    public String toString(){
        return super.toString() + "; player count: " + playerCount;
    }
}
