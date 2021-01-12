package com.kate.utils;

import com.kate.entities.Human;

import java.util.Arrays;

public class HumanList {

    private Human[] humans = new Human[0];

    public void add(Human h) {
        humans = Arrays.copyOf(humans, humans.length + 1);
        humans[humans.length - 1] = h;
    }

    public Human get(int index) {
        return humans[index];
    }

    public void set(int index, Human value) {
        humans[index] = value;
    }

    public int size() {
        return humans.length;
    }

    public void setSize(int x, Human h) {
        humans = Arrays.copyOf(humans, humans.length + x);
    }

    public int findTheSame(Human h) {
        int same = 0;
        for (int i = 0; i < humans.length; i++) {
            if (h.equals(humans[i])) {
                same = i;
            }

        }
        return same;
    }


    public void deleteByIndex(int x) {

        HumanList humansTemp = new HumanList();
        for (int i = 0; i < humans.length; i++) {
            if (i == x - 1) {
                System.out.println("The human [" + humans[x - 1] + "] was deleted");
                if (humans[i] == humansTemp.get(humansTemp.size() - 1)) {
                    humansTemp.add(humans[i]);
                    humans[x - 1] = null;
                } else {
                    humansTemp.set(i, humans[i]);
                }
            }

            for (int k = 0; k < humansTemp.size(); k++) {
                humansTemp.add(humans[i]);

            }

        }


    }
}