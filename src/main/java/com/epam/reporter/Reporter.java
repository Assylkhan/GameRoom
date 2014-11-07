package com.epam.reporter;

import com.epam.toys.Toy;
import java.util.ArrayList;

/**
 * created by Assylkhan Rakhatov on 07.11.2014
 */
public class Reporter {
    /**
     *
     * @param toys
     */
    public static void report(ArrayList<Toy> toys){
        int i = 1;
        for (Toy toy : toys){
            System.out.println(i++ + ") " + toy.toString());
        }
        System.out.println("-------------------------------------------------------------------");
    }
}
