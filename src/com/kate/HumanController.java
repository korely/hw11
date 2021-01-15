package com.kate;

import com.kate.entities.Human;
import com.kate.services.HumanService;
import com.kate.ui.HumanUI;
import com.kate.utils.HumanList;

import java.util.Scanner;

public class HumanController {

    HumanUI ui;
    HumanService hs;
    Scanner sc;
    HumanList humans;

    public HumanController(HumanUI ui, HumanService hs, Scanner sc) {
        this.ui = ui;
        this.hs = hs;
        this.sc = sc;
    }

    public void addHuman() {
        Human h = ui.readHuman(sc);
        hs.addMeHumans(h);
    }

    public void showHumans() {
        ui.showHumansHead();
        humans = hs.showMeHumans();
    }

    public void deleteHuman() {
        int x = ui.showDeleteInput();
        humans = hs.delHumanByNumber(x);
    }

    public void findLastname() {
        String s = ui.showFindLInput();
        humans = hs.findByLastname(s);
    }

    public void findName() {
        String s = ui.showFindNInput();
        humans = hs.findByName(s);
    }

}
