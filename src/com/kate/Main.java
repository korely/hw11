package com.kate;

import com.kate.ui.HumanUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HumanUI ui = new HumanUI(sc);
        HumansController hc = new HumansController(ui);


        while (true) {
            System.out.println("[1] - add human");
            System.out.println("[2] - show humans list");
            System.out.println("[3] - delete human");
            System.out.println("[4] - find by last name");
            System.out.println("[5] - find by name");
            System.out.println("[6] - exit");

            int x = sc.nextInt();
            sc.nextLine();

            if (x == 1) hc.addHuman();
            else if (x == 2) hc.showHumans();
            else if (x == 3) hc.deleteHuman();
            else if (x == 4) hc.findLastName();
            else if (x == 5) hc.findName();
            else if (x == 6) {
                hc.end();
                break;
            }
            else System.out.println("Something entered wrong...\nPlease repeat your request.\n");
        }


    }

}
