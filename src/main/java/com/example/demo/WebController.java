package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/takesmth")
    String takesmth() {
        return "Ala ma kota a kot ma ale";
    }

    @PostMapping("wrzuccos")
    void wrzuc(String s) {
        System.out.println(s);
    }
}
