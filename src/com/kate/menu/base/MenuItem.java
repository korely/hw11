package com.kate.menu.base;

import java.util.Scanner;

abstract public class MenuItem {
    private String name;
    private boolean closeAfter;
    Scanner scanner = new Scanner(System.in);

    public MenuItem(String name) {
        this.name = name;
        this.closeAfter = false;
    }

    public MenuItem(String name, boolean closeAfter) {
        this.name = name;
        this.closeAfter = closeAfter;
    }

    public String getName() {
        return name;
    }

    public abstract void exec();

    public boolean closeAfter() {
        return closeAfter;
    }

}
