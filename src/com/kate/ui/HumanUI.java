package com.kate.ui;

import com.kate.entities.Human;
import com.kate.services.HumanService;
import com.kate.utils.HumanList;
import java.util.Scanner;

public class HumanUI {

    private Scanner sc;
    public Human h = new Human();
    public HumanList humans = new HumanList();
    private HumanService hs = new HumanService(humans);

    public HumanUI(Scanner sc) {
        this.sc = sc;
    }

    public void readHuman() {

        System.out.println("Please enter humans name: ");
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Last name: ");
        String lname = sc.next();
        System.out.println("Patronymic: ");
        String patr = sc.next();
        h = new Human(name, lname, patr);
    }

    public void addUniqueHuman() {

        if (humans.size() == 0) {
            humans.add(h);
            System.out.println("The human [" + h + "] was added.");
        } else if (h.equals(humans.get(humans.findTheSame(h)))) {
            System.out.println("The human [" + h + "] is already exist");
        } else {
            humans.add(h);
            System.out.println("The human [" + h + "] was added.");
        }

    }

    public void showHumans() {
        System.out.println("List of humans: ");
        for (int i = 0; i < humans.size(); i++) {
            System.out.println((i + 1) + ". " + humans.get(i));
        }
    }

    public void showDeleteInput() {
        System.out.println("Please enter number of human");
        int x = sc.nextInt();
        hs.delHumanByNumber(x);
    }

    public void showFindLInput() {
        System.out.println("Please enter last name of human to find");
        String s = sc.next();
        hs.findByLastname(s);
    }

    public void showFindNInput() {
        System.out.println("Please enter name of human to find");
        String s = sc.next();
        hs.findByName(s);
    }

    public void showEnd() {
        theEnd:
        {
            System.out.println("Bye!");
            break theEnd;
        }
    }

}







