package com.epam.toys;

import com.epam.enums.Age;
import com.epam.enums.Size;
import com.epam.enums.TransportKinds;

/**
 * created by Assylkhan Rakhatov on 07.11.2014
 */
public class Transport extends Toy{
    private TransportKinds kind;

    /**
     *
     * @param name
     * @param price
     * @param size
     * @param age
     * @param kind
     */
    public Transport(String name, int price, Size size, Age age, TransportKinds kind){
        super(name, price, size, age);
        this.kind = kind;
    }

    public String toString(){
        return super.toString() + "; kind: " + kind;
    }
}
