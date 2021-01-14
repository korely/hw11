package com.kate.menu.base;

import java.util.Scanner;


    public class Menu {
    private MenuItem[] items;
    private Scanner scanner;

    public Menu(MenuItem[] items, Scanner scanner) {
        this.items = items;
        this.scanner = scanner;
    }
    public void run() {
        while (true) {
            showMenu();
            int choice = getUserChoice();
            if (isChoiceValid(choice)) {
                System.out.println("Something entered wrong...\nPlease repeat your request.\n");
                continue;
            }
            items[choice].exec();
            if (items[choice].closeAfter()) break;
        }
    }

    private boolean isChoiceValid(int choice) {
        return choice < 0 || choice >= items.length;
    }

    private int getUserChoice() {
        System.out.println("Please make your choice: ");
        int choice = scanner.nextInt() - 1;
        scanner.nextLine();
        return choice;
    }

    private void showMenu() {
        System.out.println("---------[MENU]---------");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + " - " + items[i].getName());

        }
    }
}