package com.example.LoveCalculator.backend.input;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;



@Component
public class Input {
    //@Max(20)
    @Pattern(regexp = "^[a-zA-Z]", message = "Enter only letters!")
    private String name1;
    //@Max(20)
    @Pattern(regexp = "^[a-zA-Z]", message = "Enter only letters!")
    private String name2;

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    //First input
    public void setName1(String name1) { this.name1 = name1;}
    //Second name input
    public void setName2(String name2) { this.name2 = name2;}

}


