package com.epam.toys;

import com.epam.enums.Age;
import com.epam.enums.BallPurposes;
import com.epam.enums.Size;

public class Ball extends Toy {
    private BallPurposes purpose;
    public Ball(String name, int price, Size size, Age age, BallPurposes purpose){
        super(name, price, size, age);
        this.purpose = purpose;
    }
    public BallPurposes getPurpose(){return purpose;}
    public String toString(){
        return super.toString() + "; purpose: " + purpose;
    }
}