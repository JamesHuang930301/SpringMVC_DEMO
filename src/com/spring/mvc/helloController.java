package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/2019")
public class helloController {
    @RequestMapping(value = "/main")
    public ModelAndView main(){
        return new ModelAndView("main");
    }
}
