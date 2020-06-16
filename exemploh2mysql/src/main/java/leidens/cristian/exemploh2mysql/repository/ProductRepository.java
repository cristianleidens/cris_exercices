package leidens.cristian.exemploh2mysql.repository;

import leidens.cristian.exemploh2mysql.model.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
}
