package com.kate;

import com.kate.entities.Human;
import com.kate.services.HumanService;
import com.kate.ui.HumanUI;

import java.util.Scanner;

public class HumanController {

    HumanUI ui;
    HumanService hs;
    Scanner sc;

    public HumanController(HumanUI ui, HumanService hs, Scanner sc) {
        this.ui = ui;
        this.hs = hs;
        this.sc = sc;
    }

    public void addHuman() {
        Human h = ui.readHuman(sc);
        boolean ifAdd = hs.addMeHumans(h);
        if (ifAdd){
            ui.showAdded(h);
        } else ui.notAdded(h);

    }

    public void showHumans() {
        ui.showHumansHead();
        hs.showMeHumans();
    }

    public void deleteHuman() {
        int x = ui.showDeleteInput();
        boolean ifDel = hs.delHumanByNumber(x);
        if(ifDel){
            ui.deleted(x);
        } else ui.notDel(x);
    }

    public void findLastname() {
        String s = ui.showFindLInput();
        int found = hs.findByLastname(s);
        if (found==0){
            ui.notFound();
        }else ui.found(s);
    }

    public void findName() {
        String s = ui.showFindNInput();
        int found = hs.findByName(s);
        if (found==0){
            ui.notFound();
        }else ui.foundN(s);
    }

}
