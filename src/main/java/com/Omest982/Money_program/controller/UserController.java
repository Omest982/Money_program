package com.Omest982.Money_program.controller;

import com.Omest982.Money_program.model.User;
import com.Omest982.Money_program.model.Wallet;
import com.Omest982.Money_program.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "New user saved!";
    }

    @PostMapping("/addWallet")
    public String addWallet(@RequestBody User user){
        userService.updateUser(user);
        return "New wallet added to user!";
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAllUsers();
    }

    @GetMapping("/get")
    public User get(@RequestBody User user){
        return userService.getUser(user.getUsername(), user.getPassword()).orElse(null);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll() {
        userService.deleteAll();
    }


}
