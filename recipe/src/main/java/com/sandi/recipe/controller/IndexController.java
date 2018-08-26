package com.sandi.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "", "/index"})
    public String loadIndexPage(){
        return "index";
    }
}
