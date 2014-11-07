package com.epam.runner;

import com.epam.enums.Age;
import com.epam.owner.Owner;
import com.epam.reporter.Reporter;
import com.epam.room.GameRoom;

/**
 * created by Assylkhan Rakhatov on 07.11.2014
 */
public class Runner {
    public static void main(String[] args) {
        Owner micheal = new Owner();
//      micheal.prepareRoom(toyCount, allocatedMoney);
        micheal.prepareRoom(50, 450000);
        GameRoom room = micheal.getRoom();
        Reporter.report(room.getToys());
        micheal.sortByName(room.getToys());
        Reporter.report(room.getToys());
        room.removeToy("ball", Age.CHILD);
        Reporter.report(room.getToys());
//                      owner.Select(toys collection, price from, price until)
        Reporter.report(micheal.Select(room.getToys(), 100, 20000));
    }
}
