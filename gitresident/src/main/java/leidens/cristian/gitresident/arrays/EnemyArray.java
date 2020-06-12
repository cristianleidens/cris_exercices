package leidens.cristian.gitresident.arrays;

import leidens.cristian.gitresident.interfaces.EnemiesArrayInterface;
import leidens.cristian.gitresident.model.Enemies;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cristian Leidens
 * @version 1.0.0
 * @since 12/06/2020 - 01:52
 * @category ArrayModel
 */
public class EnemyArray implements EnemiesArrayInterface {

    List<Enemies> enemies = new ArrayList();

    public void register(Enemies enemie) {
        this.enemies.add(enemie);
    }

    public List<Enemies> search() {
        return this.enemies;
    }

}
