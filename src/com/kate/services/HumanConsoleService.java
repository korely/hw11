package com.kate.services;

import com.kate.entities.Human;
import com.kate.utils.HumanList;

public class HumanConsoleService implements HumanService {

    HumanList humans = new HumanList();
    Human h = new Human();

    public HumanConsoleService() {
    }
@Override
    public void addMeHumans(String name, String lName, String patr) {
        h = new Human(name, lName, patr);
        if (humans.size() == 0) {
            humans.add(h);
            System.out.println("The human [" + h + "] was added.");
        } else if (h.equals(humans.get(humans.findTheSame(h)))) {
            System.out.println("The human [" + h + "] is already exist");
        } else {
            humans.add(h);
            System.out.println("The human [" + h + "] was added.");
        }
    }

    @Override
    public void showMeHumans() {
        humans.show();
    }

    @Override
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

        for (int m = 0; m < humansTemp.size(); m++) {
            humans.add(humansTemp.get(m));

        }
    }

    @Override
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

    @Override
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






