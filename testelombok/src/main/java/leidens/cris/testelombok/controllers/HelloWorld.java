package leidens.cris.testelombok.controllers;

import leidens.cris.testelombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/")
    public String index() {
        return "Eai meu consagrado";
    }
}
