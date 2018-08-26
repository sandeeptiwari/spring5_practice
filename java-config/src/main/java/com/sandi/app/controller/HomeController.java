package com.sandi.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

//echo "" >.gitignore
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("message", "Spring MVC Java Config Example");
        return "index";
    }

    @RequestMapping("/welcome")
    public ModelAndView helloWorld(){
        ModelAndView  model = new ModelAndView("HelloPage");
        model.addObject("msg", "hello world");

        return model;
    }

    @RequestMapping(value="/welcome/{countryName}/{userName}", method = RequestMethod.GET)
    public ModelAndView userName(@PathVariable String countryName, @PathVariable String userName){
        ModelAndView  model = new ModelAndView("HelloPage");
        model.addObject("country", countryName);
        model.addObject("name", userName);

        return model;
    }
}
