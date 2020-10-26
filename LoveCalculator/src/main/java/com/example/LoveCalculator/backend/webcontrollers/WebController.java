package com.example.LoveCalculator.backend.webcontrollers;


import com.example.LoveCalculator.backend.input.Input;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class WebController implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/")
    public String showForm(Input input){
        return "inputForm";
    }

    @PostMapping("/")
    public String checkValid(@Valid Input input, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "inputForm";
        }

        return "redirect:/results";
    }

}
