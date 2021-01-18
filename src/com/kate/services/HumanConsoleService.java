package com.kate.services;

import com.kate.entities.Human;
import com.kate.utils.HumanList;

public class HumanConsoleService implements HumanService {

    HumanList humans = new HumanList();

    @Override
    public boolean addMeHumans(Human h) {
        boolean ifAdd;
        if (humans.size() == 0) {
            humans.add(h);
            ifAdd = true;
        } else if (h.equals(humans.get(humans.findTheSame(h)))) {
            ifAdd = false;
        } else {
            humans.add(h);
            ifAdd = true;
        }
        return ifAdd;
    }

    @Override
    public void showMeHumans() {
        humans.show();
    }

    @Override
    public boolean delHumanByNumber(int x) {
        HumanList humansTemp = new HumanList();
        boolean ifDel = false;

        for (int i = 0; i < humans.size(); i++) {
            if (i == x - 1) {
                ifDel = true;
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
        return ifDel;
    }

    @Override
    public int findByLastname(String s) {
        Human h;
        int found = 0;

        for (int i = 0; i < humans.size(); i++) {
            h = humans.get(i);
            if (h.getLastname().equals(s)) {
                found = 1;
            }
        }
        return found;
    }

    @Override
    public int findByName(String s) {
        Human h;
        int found = 0;

        for (int i = 0; i < humans.size(); i++) {
            h = humans.get(i);
            if (h.getName().equals(s)) {
                found = 1;
            }
        }
        return found;
    }

}






