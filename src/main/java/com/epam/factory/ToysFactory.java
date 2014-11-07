package com.epam.factory;

import com.epam.enums.*;
import com.epam.toys.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * created by Assylkhan Rakhatov on 07.11.2014
 */
public class ToysFactory {
    private static Random numberGenerator = new Random();

    /**
     *
     * @param toyCount count of toys
     * @return toys
     */
    public static ArrayList<Toy> create(int toyCount){
        ArrayList<Toy> toys = new ArrayList<Toy>();
        for (int i = 0; i < toyCount; i++) {
            toys.add(releaseToy());
        }
        return toys;
    }

    /**
     *
     * @return toy
     */

    public static Toy releaseToy(){
        int randomPrice = numberGenerator.nextInt(40000) + 1;
        switch (numberGenerator.nextInt(4)){
            case 0:
                return new Ball("ball", randomPrice, randomElement(Size.values()), randomElement(Age.values()), randomElement(BallPurposes.values()));
            case 1:
                return new BoardGame("board game", randomPrice, randomElement(Size.values()), randomElement(Age.values()), 2);
            case 2:
                return new Transport("transport", randomPrice, randomElement(Size.values()), randomElement(Age.values()), randomElement(TransportKinds.values()));
            case 3:
                return new Doll("doll", randomPrice,  randomElement(Size.values()), randomElement(Age.values()), randomElement(DollBrands.values()) );
            case 4:
                return new Puzzle("puzzle", randomPrice,  randomElement(Size.values()), randomElement(Age.values()), randomElement(Measurement.values()) );
            default:
                throw new IllegalArgumentException();
        }
    }

    /**
     *
     * @param elements
     * @param <T>
     * @return random value of given enum
     */
    public static <T> T randomElement(T[] elements){
        return elements[numberGenerator.nextInt(elements.length)];
    }
}
