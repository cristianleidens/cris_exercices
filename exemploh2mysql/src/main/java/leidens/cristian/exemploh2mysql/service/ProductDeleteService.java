package leidens.cristian.exemploh2mysql.service;

import leidens.cristian.exemploh2mysql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDeleteService {

    @Autowired
    private ProductRepository productRepository;

    public void delete(long id) {
        this.productRepository.deleteById(id);
    }
}
