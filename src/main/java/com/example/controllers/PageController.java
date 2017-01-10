package com.example.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by smahanty on 1/6/17.
 */
@Controller
public class PageController {
    @RequestMapping("/doc/{id}")
    public ModelAndView getTemp(@PathVariable String id) {
        ModelAndView modelAndView = new ModelAndView("dummy");
        modelAndView.addObject("name", id);
        System.out.println("Id: " + id);
        return modelAndView;
    }
}
