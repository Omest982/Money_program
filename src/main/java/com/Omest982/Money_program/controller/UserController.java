package com.Omest982.Money_program.controller;

import com.Omest982.Money_program.model.User;
import com.Omest982.Money_program.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Omest982.Money_program.utils.Checker;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user){
        if(Checker.fullUserCheck(user)){
            userService.saveUser(user);
            return "New user saved!";
        }
        return "Error! Something wrong!";
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAllUsers();
    }

    @GetMapping("/get")
    public User get(@RequestParam String email, @RequestParam String password){
        return userService.getUser(email, password);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll() {
        userService.deleteAll();
    }


}
