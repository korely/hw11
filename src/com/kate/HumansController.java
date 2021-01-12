package com.kate;
import com.kate.ui.HumanUI;

public class HumansController {

    private HumanUI ui;

    public HumansController(HumanUI ui) {
        this.ui = ui;
    }

    public void addHuman() {
        ui.readHuman();
        ui.addUniqueHuman();
    }

    public void showHumans() {
        ui.showHumans();
    }

    public void deleteHuman() {
        ui.showDeleteInput();
    }

    public void findLastName(){
        ui.showFindLInput();
    }

    public void findName(){
        ui.showFindNInput();
    }

    public void end(){
        ui.showEnd();
    }

}
