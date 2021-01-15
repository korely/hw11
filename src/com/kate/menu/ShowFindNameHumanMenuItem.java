package com.kate.menu;

import com.kate.HumanController;
import com.kate.menu.base.MenuItem;

public class ShowFindNameHumanMenuItem extends MenuItem {
    HumanController hc;

    public ShowFindNameHumanMenuItem(HumanController hc) {
        super("Find by name");
        this.hc = hc;
    }

    @Override
    public void exec() {
        hc.findName();
    }
}
