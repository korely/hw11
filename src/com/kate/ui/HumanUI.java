package com.kate.ui;

import com.kate.entities.Human;
import java.util.Scanner;

public interface HumanUI {

    Human readHuman(Scanner sc);
    void showHumansHead();
    int showDeleteInput();
    String showFindLInput();
    String showFindNInput();

}







