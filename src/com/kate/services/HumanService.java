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
            System.out.println("The human [" + h + "] was added.");
        } else if (h.equals(humans.get(same))) {
            System.out.println("The human [" + h + "] is already exist");
        } else {
            humans.add(h);
            System.out.println("The human [" + h + "] was added.");
        }

    }

    public void showHumans() {
        System.out.println("-----------------------------------------------------");
        System.out.println("\nList of humans:\n");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < humans.size(); i++) {
            System.out.println((i + 1) + ". " + humans.get(i));
        }
    }

    public void delHumanByNumber(int x) {

        HumanList humansTemp = new HumanList();
        for (int i = 0; i < humans.size(); i++) {
            if (i == x - 1) {
                System.out.println("The human [" + humans.get(x - 1) + "] was deleted");
                humans.set(x - 1, null);
            } else {
                humans.set(i, humans.get(i));
            }
        }

        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i) != null) {
                humansTemp.add(humans.get(i));
            }
        }

        humans = new HumanList();

        for (int i = 0; i < humansTemp.size(); i++) {
            humans.add(humansTemp.get(i));
        }

    }

    public void findByLastname(String s) {
        Human h;
        int found = 0;

        for (int i = 0; i < humans.size(); i++) {
            h = humans.get(i);
            if (h.getLastname().equals(s)) {
                System.out.println("\nLastname [" + s + "] was found\n" +
                        "Human: " + (i + 1) + ". " + humans.get(i));
                found++;
            }
        }
        if (found == 0) {
            System.out.println("Nothing was found");
        }

    }

    public void findByName(String s) {
        Human h;
        int found = 0;

        for (int i = 0; i < humans.size(); i++) {
            h = humans.get(i);
            if (h.getName().equals(s)) {
                System.out.println("\nName [" + s + "] was found\n" +
                        "Human: " + (i + 1) + ". " + humans.get(i));
                found++;
            }
        }
        if (found == 0) {
            System.out.println("Nothing was found");
        }
    }

}




