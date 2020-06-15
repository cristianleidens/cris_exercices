package leidens.cristian.gitvalorant.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cristian Leidens
 * @since 15/06/2020 - 01:28
 * @version 1.0.0
 * @category Controller
 */
@RestController
public class MainController {
    @GetMapping("/")
    public String index() {
        return "This is a Git of Valorant enjoy!! \n/characters";
    }
}
