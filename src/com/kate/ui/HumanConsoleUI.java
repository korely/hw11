package com.kate.ui;

import com.kate.entities.Human;

import java.util.Scanner;

public class HumanConsoleUI implements HumanUI {

    Scanner sc = new Scanner(System.in);

    @Override
    public Human readHuman(Scanner sc) {
        Human h;
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
        h = new Human(name, lName, patr);
        return h;
    }

    @Override
    public void showHumansHead() {
        System.out.println("------List of humans------");
    }

    @Override
    public int showDeleteInput() {
        int x;
        System.out.println("Please enter number of human");
        x = sc.nextInt();
        return x;
    }

    @Override
    public String showFindLInput() {
        String s;
        System.out.println("Please enter last name of human to find");
        s = sc.next();
        return s;
    }

    @Override
    public String showFindNInput() {
        String s;
        System.out.println("Please enter name of human to find");
        s = sc.next();
        return s;
    }

    //ALERTS

    public void showAdded(Human h){
        System.out.println("The human [" + h + "] was added.");
    }
    public void notAdded(Human h){
        System.out.println("The human [" + h + "] NOT added.\n" +
                "Maybe this human is already exist");
    }

    public void deleted (int x){
        System.out.println("The human [" + x + "] was deleted");
    }

    public void notDel(int x){
        System.out.println("The human [" + x + "] NOT deleted");
    }

    public void found(String s){
        System.out.println("\nHuman with lastname [" + s + "] was found");
    }
    public void foundN(String s){
        System.out.println("\nHuman with name [" + s + "] was found");
    }

    public void notFound(){
        System.out.println("Nothing was found");
    }

}

