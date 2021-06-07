package com.angeld.azurehomepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AngelDController {
    @GetMapping(path = "/**")
    public String defaultPage() {
        return "default";
    }
}
