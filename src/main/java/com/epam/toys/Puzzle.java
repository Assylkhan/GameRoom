package com.epam.toys;

import com.epam.enums.Age;
import com.epam.enums.Measurement;
import com.epam.enums.Size;

public class Puzzle extends Toy {
    private Measurement measurement;
    public Puzzle(String name, int price, Size size, Age age, Measurement measurement){
        super(name, price, size, age);
        this.measurement = measurement;
    }

    public String toString(){
        return super.toString() + "; measurement: " + measurement;
    }
}
