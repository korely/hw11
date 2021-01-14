package com.kate;

import com.kate.menu.*;
import com.kate.menu.base.Menu;
import com.kate.menu.base.MenuItem;
import com.kate.services.HumanConsoleService;
import com.kate.services.HumanService;
import com.kate.ui.HumanConsoleUI;
import com.kate.ui.HumanUI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HumanUI ui = new HumanConsoleUI();
        HumanService hs = new HumanConsoleService();
        HumanController hc = new HumanController(ui, hs);

        MenuItem[] menuItems = {
                new ShowAddHumanMenuItem(hc),
                new com.kate.menu.ShowHumansMenuItem(hc),
                new ShowDeleteHumanMenuItem(hc),
                new ShowFindLNameHumanMenuItem(hc),
                new ShowFindNameHumanMenuItem(hc),
                new ExitMenuItem()
        };
        Menu menu = new Menu(menuItems,sc);
        menu.run();
    }

}
