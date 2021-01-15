package com.kate.services;

import com.kate.entities.Human;
import com.kate.utils.HumanList;

public interface HumanService {

    HumanList addMeHumans(Human h);
    HumanList showMeHumans();
    HumanList delHumanByNumber(int x);
    HumanList findByLastname(String s);
    HumanList findByName(String s);

}






