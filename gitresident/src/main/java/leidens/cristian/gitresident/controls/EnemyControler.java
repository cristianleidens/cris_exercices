package leidens.cristian.gitresident.controls;

import leidens.cristian.gitresident.arrays.EnemyArray;
import leidens.cristian.gitresident.model.Enemies;
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
public class EnemyControler {

    public EnemyControler() {
        enemie1.setName("Zombie");
        enemie1.setAtack("Bite, Scratch, Vomit, Crawling, Playing Dead, Diving(Only RE2 and RE:Code Veronica), Sprinting)");
        enemie1.setVirusType("T-Virus Type");
        enemies.register(enemie1);

        enemie2.setName("Licker");
        enemie2.setAtack("Claw, Tongue, Jump claw");
        enemie2.setVirusType("T-Virus Type");
        enemies.register(enemie2);
    }

    EnemyArray enemies = new EnemyArray();
    Enemies enemie1 = new Enemies();
    Enemies enemie2 = new Enemies();

    @GetMapping("/enemies")
    public List<Enemies> enemies() {
        return enemies.search();
    }

}
