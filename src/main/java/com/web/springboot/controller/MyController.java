package com.web.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for web app
 */
@Controller
public class MyController {
    /**
     * Method to show  task 1 web page
     * @return empty task 1 jsp page
     */
    @RequestMapping("/task1")
    public String task1() {
        return "task1";
    }
    /**
     * Method to show  task 2 web page
     * @return empty task 2 jsp page
     */
    @RequestMapping("/task2")
    public String task2() {
        return "task2";
    }
}
