package com.lynas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sjkrypaa on 25.08.2016.
 */

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(){
        return "test";
    }
}
