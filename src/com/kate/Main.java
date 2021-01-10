package com.kate;

import com.kate.entities.Human;
import com.kate.phonebook.Menu;
import com.kate.services.HumanService;

public class Main {

    public static void main(String[] args) {

        //        Menu menu = new Menu();
        //        menu.showMenu();


        Human h = new Human("Shaun", "Hodgson", "Leon");
        Human h1 = new Human("Anabella", "Tucker", "Cian");
        Human h2 = new Human("Charlie", "Hackett", "Elissa");
        Human h3 = new Human("Amirah", "Sheridan", "Camden");
        Human h4 = new Human("Constance", "Busby", "Gilliam");
        Human h5 = new Human("Meghan", "Krause", "Amaya");
        Human h6 = new Human("Constance", "Busby", "Gilliam");
        Human h7 = new Human("aaaa", "aaa", "aaaa");
        Human h8 = new Human("0000", "oooo", "0000");
        HumanService hs = new HumanService();

        hs.addHuman(h);
        hs.addHuman(h1);
        hs.addHuman(h2);
        hs.addHuman(h3);
        hs.addHuman(h4);
        hs.addHuman(h5);
        hs.addHuman(h6);
        hs.addHuman(h7);
        hs.addHuman(h8);
        hs.showHumans();



    }

}
