package com.epam.toys;

import com.epam.enums.Age;
import com.epam.enums.DollBrands;
import com.epam.enums.Size;

/**
 * created by Assylkhan Rakhatov on 07.11.2014
 */
public class Doll extends Toy {
    private DollBrands brand;

    /**
     *
     * @param name
     * @param price
     * @param size
     * @param age
     * @param brand
     */
    public Doll(String name, int price, Size size, Age age, DollBrands brand){
        super(name, price, size, age);
        this.brand = brand;
    }

    public String toString(){
        return super.toString() + "; brand: " + brand;
    }
}