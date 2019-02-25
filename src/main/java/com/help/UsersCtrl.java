package com.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersCtrl {

    @GetMapping("/")
//    @ResponseBody
    public String index () {
        return "index";
    }

    @GetMapping("/profile")
    @ResponseBody
    public String showProfile(){
        return "profile page placeholder";
    }

    @PostMapping("/profile")
    @ResponseBody
    public String getProfileInfo(@RequestParam(name="username") String username){
        System.out.println("username = " + username);
        return "profile page submission placeholder " + username;
    }


    @GetMapping("/users")
    @ResponseBody
    public List<String> showListOfUsers(){
        List<String> users = new ArrayList<>();
        users.add("Fer");
        users.add("Ryan");
        users.add("Sophie");
        return users;
    }

    @GetMapping("/forgotPassword")
    @ResponseBody
    public String forgotPassword(){
        return "forgotPassword page placeholder";
    }

}
