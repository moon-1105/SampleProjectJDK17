package com.testApp.controller;

import com.sun.tools.javac.Main;
import com.testApp.service.MainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
public class MainController {
    @RequestMapping("/index")
    public String testPage(){
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainPage(){
        MainService main = new MainService();
        main.mainService();
        return "main";
    }

}
