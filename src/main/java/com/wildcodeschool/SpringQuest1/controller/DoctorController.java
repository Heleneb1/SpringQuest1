package com.wildcodeschool.SpringQuest1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// @RequestMapping("/doctor")
public class DoctorController {

    @GetMapping("/doctor")
    @ResponseBody
    public String index() {
        System.out.println("Hello");
        return "The doctor selected";
    }

    @GetMapping("/doctor/1")
    @ResponseBody
    public String doctor1() {

        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String doctor10() {

        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String doctor13() {

        return "Jodie Whittaker";
    }
}
