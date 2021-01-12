package com.kate.services;

import com.kate.entities.Human;
import com.kate.utils.HumanList;

public class HumanService {

    public HumanList humans;

    public HumanService(HumanList humans) {
        this.humans = humans;
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






