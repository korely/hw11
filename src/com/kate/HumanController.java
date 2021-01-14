package com.kate;

import com.kate.services.HumanService;
import com.kate.ui.HumanUI;

public class HumanController {

    HumanUI ui;
    HumanService hs;

    public HumanController(HumanUI ui, HumanService hs) {
        this.ui = ui;
        this.hs = hs;
    }

    public void addHuman() {
        ui.readHuman();
    }

    public void showHumans() {
        ui.showHumansHead();
        hs.showMeHumans();
    }

    public void deleteHuman(){
        ui.showDeleteInput();
    }
    public void findLastname(){
        ui.showFindLInput();
    }
    public void findName(){
        ui.showFindNInput();
    }

}
