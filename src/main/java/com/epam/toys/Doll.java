package com.epam.toys;

import com.epam.enums.Age;
import com.epam.enums.DollBrands;
import com.epam.enums.Size;

public class Doll extends Toy {
    private DollBrands brand;
    public Doll(String name, int price, Size size, Age age, DollBrands brand){
        super(name, price, size, age);
        this.brand = brand;
    }

    public String toString(){
        return super.toString() + "; brand: " + brand;
    }
}