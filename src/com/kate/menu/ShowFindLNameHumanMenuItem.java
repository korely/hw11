package com.kate.menu;

import com.kate.HumanController;
import com.kate.menu.base.MenuItem;

public class ShowFindLNameHumanMenuItem extends MenuItem {
    HumanController hc;

    public ShowFindLNameHumanMenuItem(HumanController hc) {
        super("Find by last name");
    }

    @Override
    public void exec() {
        hc.findLastname();
    }
}
