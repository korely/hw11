package com.kate.phonebook;

import com.kate.entities.Human;
import com.kate.services.HumanService;

import java.util.Scanner;

public class Menu {

    public void showMenu() {

        HumanService hs = new HumanService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Phone Book");
        System.out.println("\n[add] - add human\n[show] - show humans list\n" +
                "[delete] - delete human\n[findL] - find by last name\n[findN] find by name\n[end] exit from menu\n");

        while (true) {
            System.out.println("-----------------Please do a choice-----------------");
            String choice = sc.next();

            if (choice.equals("add")) {
                System.out.println("Please enter a human name: ");
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Last name: ");
                String lname = sc.next();
                System.out.println("Patronymic: ");
                String patr = sc.next();
                Human h = new Human(name, lname, patr);
                hs.addHuman(h);
            }
            else if (choice.equals("show")) {
                hs.showHumans();
            }
            else if (choice.equals("delete")) {
                System.out.println("Please enter number of human");
                int hNum = sc.nextInt();
                hs.delHumanByNumber(hNum);
            }
            else if (choice.equals("findL")) {
                System.out.println("Please enter last name of human to find");
                String findLastName = sc.next();
                hs.findByLastname(findLastName);
            }
            else if (choice.equals("findN")) {
                System.out.println("Please enter name of human to find");
                String findName = sc.next();
                hs.findByName(findName);
            }
            else if (choice.equals("end")) {
                System.out.println("Bye!");
                break;
            }

            else{
                System.out.println("Something entered wrong...\nPlease repeat your request.\n");
            }

        }

    }
}