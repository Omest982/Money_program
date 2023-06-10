package com.Omest982.Money_program.utils;

import com.Omest982.Money_program.model.User;

public class Checker {
    public static boolean fullUserCheck(User user) {
        if(user.getEmail().split("@").length != 2){
            return false;
        }
        if(user.getPassword().length() < 6){
            return false;
        }
        return true;
    }
}
