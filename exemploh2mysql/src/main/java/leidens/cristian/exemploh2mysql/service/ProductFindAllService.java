package leidens.cristian.exemploh2mysql.service;

import leidens.cristian.exemploh2mysql.model.ProductEntity;
import leidens.cristian.exemploh2mysql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductFindAllService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> findAll() {
        return (List<ProductEntity>)this.productRepository.findAll();
    }

}
