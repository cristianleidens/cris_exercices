package leidens.cris.testelombok.controllers;

import leidens.cris.testelombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientControler {


    @GetMapping("/client")
    public Client getClient() {
        Client client = new Client();
        client.setName("Cris");
        client.setLastName("Leidens");
        client.setAge(23);
        client.setFunction("Vagabundo");

        return client;
    }
}
