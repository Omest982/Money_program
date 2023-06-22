package com.Omest982.Money_program.dto;


import com.Omest982.Money_program.model.Role;
import com.Omest982.Money_program.model.Status;
import com.Omest982.Money_program.model.User;
import lombok.Data;

@Data
public class UserDTO {
    private String username;

    private String email;

    private String password;

    public static User dtoToUser(UserDTO userDTO){
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setStatus(Status.ACTIVE);
        user.setRole(Role.USER);
        return user;
    }
}
