package leidens.cristian.gitresident.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cristian Leidens
 * @version 1.0.0
 * @since 12/06/2020 - 01:52
 * @category Model
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Enemies {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String atack;
    @Getter @Setter
    private String virusType;

}
