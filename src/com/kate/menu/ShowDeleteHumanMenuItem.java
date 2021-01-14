package com.kate.menu;

import com.kate.HumanController;
import com.kate.menu.base.MenuItem;

public class ShowDeleteHumanMenuItem extends MenuItem {
    HumanController hc;

    public ShowDeleteHumanMenuItem(HumanController hc) {
        super("Delete human");
    }

    @Override
    public void exec() {
        hc.deleteHuman();
    }
}
