package com.Omest982.Money_program.controller;

import com.Omest982.Money_program.dto.UserDTO;
import com.Omest982.Money_program.dto.UserLoginDTO;
import com.Omest982.Money_program.model.User;
import com.Omest982.Money_program.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.Omest982.Money_program.utils.Checker;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @PostMapping("/add")
    public String add(@RequestBody UserDTO userDTO){
        if(Checker.fullUserCheck(userDTO)){
            userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
            User user = UserDTO.dtoToUser(userDTO);
            userService.saveUser(user);
            return "New user saved!";
        }
        return "Error! Something wrong!";
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAllUsers();
    }

    @PostMapping("/get")
    public User get(@RequestBody UserLoginDTO userLoginDTO){
        return userService.getUserByUsernameAndPassword(userLoginDTO.getUsername(), userLoginDTO.getPassword());
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll() {
        userService.deleteAll();
    }

}
