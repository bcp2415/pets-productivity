package com.example.petsproductivity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PetsController {

    @RequestMapping(value="")
    @ResponseBody
    public String index() {
        return "Hello, world!";
    }

    @RequestMapping(value="goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye";
    }
}
