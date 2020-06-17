package leidens.cristian.exemploh2mysql.service;

import leidens.cristian.exemploh2mysql.model.ProductEntity;
import leidens.cristian.exemploh2mysql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductFindByIdService {

    @Autowired
    private ProductRepository productRepository;

    public ProductEntity findById(long id) {
        return this.productRepository.findById(id).get();
    }

}
