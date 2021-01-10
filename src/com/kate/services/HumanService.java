package com.kate.services;

import com.kate.entities.Human;
import com.kate.utils.HumanList;

public class HumanService {
    private HumanList humans = new HumanList();

    public void addHuman(Human h) {

        int same = 0;
        for (int i = 0; i < humans.size(); i++) {
            if (h.equals(humans.get(i))) {
                same = i;
            }
        }
        if (humans.size() == 0) {
            humans.add(h);
            System.out.println("The human " + h + " was added.");
        } else if (h.equals(humans.get(same))) {
            System.out.println("The human " + h + " is already exist");
        } else {
            humans.add(h);
            System.out.println("The human " + h + " was added.");
        }
    }

    public void showHumans() {

        System.out.println("\nList of humans:\n");
        for (int i = 0; i < humans.size(); i++) {
            System.out.println((i + 1) + ". " + humans.get(i));
        }
    }

    public void delHumanByNumber(int x) {

        HumanList newHumans = new HumanList();

        for (int i = 0; i < humans.size(); i++) {
            if (i == x - 1) {
                System.out.println("The human " + humans.get(x - 1) + " was deleted");
            } else {
                newHumans.add(humans.get(i));
            }
        }

        for (int i = 0; i < newHumans.size(); i++) {
            humans.set(i, newHumans.get(i));
        }
    }

}
