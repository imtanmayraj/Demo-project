package com.tanmay.App;


import org.springframework.stereotype.Component;

@Component
public class Alien {
    Laptop laptop;
    public void code()
    {
//        System.out.println("coding");
        laptop.compile();
    }
}
