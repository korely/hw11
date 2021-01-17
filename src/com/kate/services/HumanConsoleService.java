package com.kate.services;

import com.kate.entities.Human;
import com.kate.ui.HumanConsoleUI;
import com.kate.utils.HumanList;

public class HumanConsoleService implements HumanService {

    HumanList humans = new HumanList();
    HumanConsoleUI ui = new HumanConsoleUI();

    @Override
    public HumanList addMeHumans(Human h) {
        if (humans.size() == 0) {
            humans.add(h);
            ui.showAdded(h);
        } else if (h.equals(humans.get(humans.findTheSame(h)))) {
            ui.alreadyExist(h);
        } else {
            humans.add(h);
            ui.showAdded(h);
        }
        return humans;
    }

    @Override
    public HumanList showMeHumans() {
        humans.show();
        return humans;
    }

    @Override
    public HumanList delHumanByNumber(int x) {
        HumanList humansTemp = new HumanList();

        for (int i = 0; i < humans.size(); i++) {
            if (i == x - 1) {
                ui.deleted(humans, x);
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
        return humans;
    }

    @Override
    public HumanList findByLastname(String s) {
        Human h;
        int found = 0;

        for (int i = 0; i < humans.size(); i++) {
            h = humans.get(i);
            if (h.getLastname().equals(s)) {
                ui.found(humans, s, i);
                found++;
            }
        }
        if (found == 0) {
            ui.notFound();
        }
        return humans;
    }

    @Override
    public HumanList findByName(String s) {
        Human h;
        int found = 0;

        for (int i = 0; i < humans.size(); i++) {
            h = humans.get(i);
            if (h.getName().equals(s)) {
                ui.found(humans, s, i);
                found++;
            }
        }
        if (found == 0) {
            ui.notFound();
        }
        return humans;
    }

}






