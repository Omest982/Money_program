package com.Omest982.Money_program.utils;

import com.Omest982.Money_program.dto.UserDTO;

public class Checker {
    public static boolean fullUserCheck(UserDTO userDTO) {
        if(userDTO.getEmail().split("@").length != 2){
            return false;
        }
        if(userDTO.getPassword().length() < 6){
            return false;
        }
        return true;
    }
}
