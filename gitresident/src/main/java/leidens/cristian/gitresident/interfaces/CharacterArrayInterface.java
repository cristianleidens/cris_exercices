package leidens.cristian.gitresident.interfaces;

import leidens.cristian.gitresident.model.Characters;

import java.util.List;

/**
 * @author Cristian Leidens
 * @version 1.0.0
 * @since 12/06/2020 - 01:52
 * @category Interface
 */
public interface CharacterArrayInterface {

    void register(Characters var1);

    List<Characters> search();
}
