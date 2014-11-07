package com.epam.toys;

import com.epam.enums.Age;
import com.epam.enums.Size;

public class BoardGame extends Toy{
    private int playerCount;
    public BoardGame(String name, int price, Size size, Age age, int playerCount){
        super(name, price, size, age);
        this.playerCount = playerCount;
    }

    public String toString(){
        return super.toString() + "; player count: " + playerCount;
    }
}
