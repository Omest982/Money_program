package com.Omest982.Money_program.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class TestController {
    @GetMapping("/forAll")
    public String forAll(){
        return "forAll";
    }

    @GetMapping("/authenticated")
    public String authenticated(){
        return "authenticated";
    }

    @GetMapping("/forUser")
    public String forUser(){
        return "forUser";
    }

    @GetMapping("/forAdmin")
    public String forAdmin(){
        return "forAdmin";
    }
}
