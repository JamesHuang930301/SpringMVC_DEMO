package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/jameshuang")
public class helloController {
    @RequestMapping(value = "/welcome")
    public ModelAndView hello(){
        return new ModelAndView("welcome");
    }
}
