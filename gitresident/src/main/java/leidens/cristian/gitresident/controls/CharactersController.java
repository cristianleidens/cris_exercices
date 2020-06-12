package leidens.cristian.gitresident.controls;

import leidens.cristian.gitresident.arrays.CharactersArray;
import leidens.cristian.gitresident.model.Characters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Cristian Leidens
 * @version 1.0.0
 * @since 12/06/2020 - 01:52
 * @category controller
 */
@RestController
public class CharactersController {

    public CharactersController() {
        character1.setName("Jill Valentine");
        character1.setYear(1974);
        character1.setPersonalWeapon("Stars Beretta 9mm");
        characters.register(character1);

        character2.setName("Berry Burton");
        character2.setYear(1960);
        character2.setPersonalWeapon("Colt Python .455 Magun");
        characters.register(character2);
    }

    CharactersArray characters = new CharactersArray();
    Characters character1 = new Characters();
    Characters character2 = new Characters();

    @GetMapping("/characters")
    public List<Characters> charactersList() {
        return characters.search();
    }

}
