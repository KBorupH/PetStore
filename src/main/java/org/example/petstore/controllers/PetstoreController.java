package org.example.petstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PetStore")
public class PetstoreController {

    @GetMapping("/pets")
    int all() {
        return 450;
    }
}
