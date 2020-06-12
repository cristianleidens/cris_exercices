package leidens.cristian.gitresident.model;

import lombok.*;

/**
 * @author Cristian Leidens
 * @version 1.0.0
 * @since 12/06/2020 - 01:52
 * @category Model
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Characters {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private int year;
    @Getter @Setter
    private String personalWeapon;

}
