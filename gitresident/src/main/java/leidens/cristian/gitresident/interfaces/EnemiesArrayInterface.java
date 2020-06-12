package leidens.cristian.gitresident.interfaces;

import leidens.cristian.gitresident.model.Enemies;

import java.util.List;

/**
 * @author Cristian Leidens
 * @version 1.0.0
 * @since 12/06/2020 - 01:52
 * @category Interface
 */
public interface EnemiesArrayInterface {

    void register(Enemies var1);

    List<Enemies> search();

}
