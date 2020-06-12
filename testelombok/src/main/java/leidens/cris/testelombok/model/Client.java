package leidens.cris.testelombok.model;

import lombok.*;

@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private String function;

    @Getter @Setter
    private int age;

}
