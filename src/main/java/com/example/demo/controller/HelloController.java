package com.example.demo.controller;

/**
 * Created by huangpenglong on 2017/9/18.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

        @RequestMapping("/hello/{name}")
        public String hello(@PathVariable("name") String name, Model model) {
            model.addAttribute("name", name);
            return "hello";
        }

}
