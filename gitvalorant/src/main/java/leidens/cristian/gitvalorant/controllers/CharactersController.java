package leidens.cristian.gitvalorant.controllers;

import leidens.cristian.gitvalorant.characters.Characters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cristian Leidens
 * @since 15/06/2020 - 01:28
 * @version 1.0.0
 * @category Controller
 */
@RestController
public class CharactersController {

    public CharactersController() {
        character1.setName("Breach");
        character1.setLocation("Suécia");
        character1.setHabilityC("Pós-Choque");
        character1.setDetalhesHabilityC("equipe uma carga de fusão. Dispare a carga para armar um jato de ação lenta pela parede, " +
                "que causa dano alto a todos que estiverem na área de efeito");
        character1.setHabilityQ("Ponto de Clarão");
        character1.setDetalhesHabilityQ("equipe uma carga cegante. Dispare a carga para armar um jeito de ação rápida pela " +
                "parede. A carga é detonada, cegando todos jogadores que estiverem olhando para ela");
        character1.setHabilityE("Falha Tectônica");
        character1.setDetalhesHabilityE("equipe um impacto sísmico. Segure disparo para aumentar a distância. Solte para iniciar o terremoto, " +
                "estonteando todos os jogadores na zona e numa linha reta até ela");
        character1.setHabilityX("Trovão Giratório");
        character1.setDetalhesHabilityX("equipe uma carga sísmica. Dispare para lançar um terremoto em cascata por todo o terreno num grande " +
                "cone que estonteia e derruba todos os que estiverem na área de efeito");
        characters.add(character1);
    }

    List<Characters> characters = new ArrayList();
    Characters character1 = new Characters();

    @GetMapping("/characters")
    public List<Characters> characterList() {
        return this.characters;
    }
}
