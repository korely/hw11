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


    public int findTheSame(Human h) {
        int same = 0;
        for (int i = 0; i < humans.length; i++) {
            if (h.equals(humans[i])) {
                same = i;
            }

        }
        return same;
    }

    public void show(){
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i]);
        }
    }


}