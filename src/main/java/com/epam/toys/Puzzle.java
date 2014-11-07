package com.epam.toys;

import com.epam.enums.Age;
import com.epam.enums.Measurement;
import com.epam.enums.Size;

/**
 * created by Assylkhan Rakhatov on 07.11.2014
 */
public class Puzzle extends Toy {
    private Measurement measurement;

    /**
     *
     * @param name
     * @param price
     * @param size
     * @param age
     * @param measurement
     */
    public Puzzle(String name, int price, Size size, Age age, Measurement measurement){
        super(name, price, size, age);
        this.measurement = measurement;
    }

    public String toString(){
        return super.toString() + "; measurement: " + measurement;
    }
}
