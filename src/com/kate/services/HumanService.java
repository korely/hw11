package com.kate.services;

import com.kate.entities.Human;
import com.kate.utils.HumanList;

public class HumanService {

    public HumanList humans;

    public HumanService(HumanList humans) {
        this.humans = humans;
    }

    public void delHumanByNumber(int x) {

        humans.deleteByIndex(x);
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




