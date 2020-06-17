package leidens.cristian.exemploh2mysql.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Cristian
 * @version 1.0.0
 * @since 16/06/2020
 * @category Model
 */
//Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

//Springboot
@Component

//JPA
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private long id;

    @Column(name = "name")
    @NotBlank(message = "Invalid name")
    private String name;

    @Column(name = "price")
    @NotNull(message = "Can't price empty")
    private double price;

}
