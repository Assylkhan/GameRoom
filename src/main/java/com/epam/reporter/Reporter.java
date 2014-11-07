package com.epam.reporter;

import com.epam.toys.Toy;

import java.util.ArrayList;

public class Reporter {
    public static void report(ArrayList<Toy> toys){
        int i = 1;
        for (Toy toy : toys){
            System.out.println(i++ + ") " + toy.toString());
        }
        System.out.println("-------------------------------------------------------------------");
    }
}
