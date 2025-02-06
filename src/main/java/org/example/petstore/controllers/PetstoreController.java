package org.example.petstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping
public class PetstoreController {

    @GetMapping("/amountOfPets")
    int all() {
        return 450;
    }

    @GetMapping("/add")
    int add(@RequestParam int a , @RequestParam int b) {
        return a+b;
    }
}
