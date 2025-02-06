package org.example.petstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String frontPage() {
        return "frontPage";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "aboutPage";
    }
}
