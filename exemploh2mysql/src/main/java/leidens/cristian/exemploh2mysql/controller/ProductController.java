package leidens.cristian.exemploh2mysql.controller;

import leidens.cristian.exemploh2mysql.model.ProductEntity;
import leidens.cristian.exemploh2mysql.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/products")

public class ProductController {

    @Autowired
    private ProductFindAllService productFindAllService;

    @Autowired
    private ProductFindByIdService productFindByIdService;

    @Autowired
    private ProductSaveService productSaveService;

    @Autowired
    private ProductUpdateService productUpdateService;

    @Autowired
    private ProductDeleteService productDeleteService;

    @GetMapping
    public ResponseEntity<List<ProductEntity>> findAll() {
        return new ResponseEntity<List<ProductEntity>>(
                this.productFindAllService.findAll(),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ProductEntity> findById(@PathVariable("id") long id) {
        ProductEntity productEntity = this.productFindByIdService.findById(id);
        if(productEntity != null) {
            return new ResponseEntity<ProductEntity>(productEntity ,new HttpHeaders(),HttpStatus.OK);
        }
        return new ResponseEntity<ProductEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<ProductEntity> save(@Valid @RequestBody ProductEntity productEntity) {
        return new ResponseEntity<ProductEntity>(
               this.productSaveService.save(productEntity) ,new HttpHeaders(),HttpStatus.CREATED
        );
    }

    @PutMapping
    public ResponseEntity<ProductEntity> update(@RequestBody ProductEntity productEntity) throws Exception{
        return new ResponseEntity<ProductEntity>(
                this.productUpdateService.update(productEntity),new HttpHeaders(), HttpStatus.OK
        );
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<ProductEntity> delete(@PathVariable("id") long id) {
        this.productDeleteService.delete(id);
        return new ResponseEntity<ProductEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}
