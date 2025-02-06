package org.example.petstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller
public class WebController {

    @GetMapping("/")
    public String frontPage() {
        return "frontPage";
    }

    @GetMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("team1", "Kevin");
        return "aboutPage";
    }
}
