package com.kate.menu;

import com.kate.HumanController;
import com.kate.menu.base.MenuItem;

public class ShowAddHumanMenuItem extends MenuItem {
    HumanController hc;

    public ShowAddHumanMenuItem(HumanController hc) {
        super("Add Human");
        this.hc = hc;
    }

    @Override
    public void exec() {
        hc.addHuman();
    }
}

