package com.kate.menu;

import com.kate.menu.base.MenuItem;

public class ExitMenuItem extends MenuItem {

        public ExitMenuItem() {
            super("Exit", true);
        }

        @Override
        public void exec() {
            System.out.println("Good bye");
        }
    }

