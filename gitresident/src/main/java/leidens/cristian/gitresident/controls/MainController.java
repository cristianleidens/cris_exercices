package leidens.cristian.gitresident.controls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cristian Leidens
 * @version 1.0.0
 * @since 12/06/2020 - 01:52
 * @category controller
 */
@RestController
public class MainController {

    @GetMapping("/")
    public String index() {
        return "This is a Git of Resident evil enjoy!! \n/enemies \n/characters";
    }

}
