package com.kate.menu;

import com.kate.HumanController;
import com.kate.menu.base.MenuItem;
import com.kate.services.HumanConsoleService;
import com.kate.services.HumanService;
import com.kate.ui.HumanConsoleUI;
import com.kate.ui.HumanUI;

public class ShowHumansMenuItem extends MenuItem {
    HumanUI ui = new HumanConsoleUI();
    HumanService hs = new HumanConsoleService();
    HumanController hc = new HumanController(ui, hs);

    public ShowHumansMenuItem(HumanController hc) {
        super("Show humans list");
    }

    @Override
    public void exec() {
        hc.showHumans();
    }
}

