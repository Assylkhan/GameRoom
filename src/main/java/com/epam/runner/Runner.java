package com.epam.runner;

import com.epam.enums.Age;
import com.epam.enums.Size;
import com.epam.owner.Owner;
import com.epam.reporter.Reporter;
import com.epam.room.GameRoom;
import com.epam.toys.Toy;
import com.epam.toys.Transport;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Logger;

/**
 * @author Assylkhan Rakhatov
 * */

public class Runner {
    public static void main(String[] args) {
        Owner micheal = new Owner();
//          micheal.prepareRoom(toyCount, allocatedMoney);
        micheal.prepareRoom(50, 450000);
        GameRoom room = micheal.getRoom();
        Reporter.report(room.getToys());
        micheal.sortByName(room.getToys());
        Reporter.report(room.getToys());
        room.removeToy("ball", Age.CHILD);
        Reporter.report(room.getToys());
        Reporter.report(micheal.Select(room.getToys(), 100, 20000));
    }
}
