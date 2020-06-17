package leidens.cristian.exemploh2mysql.repository;

import leidens.cristian.exemploh2mysql.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Cristian
 * @version 1.0.0
 * @since 16/06/2020
 * @category Repository
 */

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
}
