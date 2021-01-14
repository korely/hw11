package com.kate.ui;

import com.kate.services.HumanConsoleService;
import com.kate.services.HumanService;

import java.util.Scanner;

public class HumanConsoleUI implements HumanUI {

    Scanner sc = new Scanner(System.in);
    HumanService hc = new HumanConsoleService();

    @Override
    public void readHuman() {

        System.out.println("Please enter humans name: ");
        System.out.println("Name: ");
        String name = sc.next();
        sc.nextLine();
        System.out.println("Last name: ");
        String lName = sc.next();
        sc.nextLine();
        System.out.println("Patronymic: ");
        String patr = sc.next();
        sc.nextLine();
        hc.addMeHumans(name, lName, patr);
    }

    @Override
    public void showHumansHead() {
        System.out.println("------List of humans------");
    }

    @Override
    public void showDeleteInput() {
        System.out.println("Please enter number of human");
        int x = sc.nextInt();
        hc.delHumanByNumber(x);
    }

    @Override
    public void showFindLInput() {
        System.out.println("Please enter last name of human to find");
        String s = sc.next();
        hc.findByLastname(s);
    }

    @Override
    public void showFindNInput() {
        System.out.println("Please enter name of human to find");
        String s = sc.next();
        hc.findByName(s);
    }

}

