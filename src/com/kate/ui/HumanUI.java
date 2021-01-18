package com.kate.ui;

import com.kate.entities.Human;

import java.util.Scanner;

public interface HumanUI {

    Human readHuman(Scanner sc);
    void showHumansHead();
    int showDeleteInput();
    String showFindLInput();
    String showFindNInput();
    void showAdded(Human h);
    void notAdded(Human h);
    void deleted (int x);
    void notDel(int x);
    void found(String s);
    void foundN(String s);
    void notFound();



}







