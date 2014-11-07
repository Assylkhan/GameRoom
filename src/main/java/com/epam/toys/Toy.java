package com.epam.toys;

import com.epam.enums.Age;
import com.epam.enums.Size;

public abstract class Toy {
    private String name;
    private Size size;
    private Age age;
    private int price;
    public Toy(String name, int price, Size size, Age age){
        this.name = name;
        this.price = price;
        this.size = size;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
    public Age getAge(){
        return age;
    };

    public Size getSize(){
        return size;
    }

    @Override
    public String toString(){
        return "name: " + name + "; age: " + age + "; size: " + size + "; price:" + price;
    }
}
