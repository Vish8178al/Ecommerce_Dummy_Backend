package com.vishal.springbootdemo.controller;

import com.vishal.springbootdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController

public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @RequestMapping("/user")
    @GetMapping("/user")
    public User user(){
        User user=new User();
        user.setId("1");
        user.setName("Vishal Chauhan");
        user.setEmailId("vishu@gmail.com");


        return user;
    }
     @GetMapping("/{id}")
    public String pathVariable(@PathVariable String id){
        return "This is path variable: "+id;
    }
    @GetMapping("/requestParam")
    public String requestParam(@RequestParam String name){
        return "Your name is: "+name;
    }
}
