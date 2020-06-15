package leidens.cristian.gitvalorant.characters;

import lombok.*;

/**
 * @author Cristian Leidens
 * @since 15/06/2020 - 01:28
 * @version 1.0.0
 * @category Modal
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Characters {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String location;
    @Getter @Setter
    private String habilityC;
    @Getter @Setter
    private String detalhesHabilityC;
    @Getter @Setter
    private String habilityQ;
    @Getter @Setter
    private String detalhesHabilityQ;
    @Getter @Setter
    private String habilityE;
    @Getter @Setter
    private String detalhesHabilityE;
    @Getter @Setter
    private String habilityX;
    @Getter @Setter
    private String detalhesHabilityX;

}