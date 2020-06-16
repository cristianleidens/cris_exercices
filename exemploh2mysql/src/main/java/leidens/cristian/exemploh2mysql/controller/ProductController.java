package leidens.cristian.exemploh2mysql.controller;

import leidens.cristian.exemploh2mysql.model.ClientEntity;
import leidens.cristian.exemploh2mysql.model.ProductEntity;
import leidens.cristian.exemploh2mysql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<ProductEntity>> findAll() {
        return new ResponseEntity<List<ProductEntity>>(
                (List<ProductEntity>)this.productRepository.findAll(),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ProductEntity> findById(@PathVariable("id") long id) {
        if(this.productRepository.findById(id).isPresent()) {
            return new ResponseEntity<ProductEntity>(this.productRepository.findById(id).get() ,new HttpHeaders(),HttpStatus.OK);
        }
        return new ResponseEntity<ProductEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<ProductEntity> save(@Valid @RequestBody ProductEntity productEntity) {
        return new ResponseEntity<ProductEntity>(
                this.productRepository.save(productEntity),new HttpHeaders(),HttpStatus.CREATED
        );
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ProductEntity> update(@PathVariable("id") long id, @RequestBody ProductEntity productEntity) throws Exception{
        if(id == 0 || this.productRepository.existsById(id)) {
            throw new Exception("Code not found");
        }

        return new ResponseEntity<ProductEntity>(
                this.productRepository.save(productEntity),new HttpHeaders(), HttpStatus.OK
        );
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<ProductEntity> delete(@PathVariable("id") long id) {
        return new ResponseEntity<ProductEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}
