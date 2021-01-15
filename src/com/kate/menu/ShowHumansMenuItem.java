package com.kate.menu;

import com.kate.HumanController;
import com.kate.menu.base.MenuItem;

public class ShowHumansMenuItem extends MenuItem {

    HumanController hc;

    public ShowHumansMenuItem(HumanController hc) {
        super("Show humans list");
        this.hc = hc;
    }

    @Override
    public void exec() {
        hc.showHumans();
    }
}

