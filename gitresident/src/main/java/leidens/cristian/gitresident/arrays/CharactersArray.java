package leidens.cristian.gitresident.arrays;

import leidens.cristian.gitresident.interfaces.CharacterArrayInterface;
import leidens.cristian.gitresident.model.Characters;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cristian Leidens
 * @version 1.0.0
 * @since 12/06/2020 - 01:52
 * @category ArrayModel
 */
public class CharactersArray implements CharacterArrayInterface {

    List<Characters> characters = new ArrayList();

    /**
     * Register a character on a list
     * @param character
     */
    public void register(Characters character) {
        this.characters.add(character);
    }

    /**
     * Show the list of characters
     * @return
     */
    public List<Characters> search() {
        return this.characters;
    }

}
