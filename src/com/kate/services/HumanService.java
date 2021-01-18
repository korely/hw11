package com.kate.services;

import com.kate.entities.Human;

public interface HumanService {

    boolean addMeHumans(Human h);
    void showMeHumans();
    boolean delHumanByNumber(int x);
    int findByLastname(String s);
    int findByName(String s);

}






