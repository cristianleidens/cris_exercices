package leidens.cristian.exemploh2mysql.controller;

import leidens.cristian.exemploh2mysql.model.ClientEntity;
import leidens.cristian.exemploh2mysql.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//SpringBoot
@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public ResponseEntity<List<ClientEntity>> findAll() {
        return new ResponseEntity<List<ClientEntity>>(
                (List<ClientEntity>)this.clientRepository.findAll(),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ClientEntity> findById(@PathVariable("id") long id) {
        if(this.clientRepository.findById(id).isPresent()) {
            return new ResponseEntity<ClientEntity>(this.clientRepository.findById(id).get() ,new HttpHeaders(),HttpStatus.OK);
        }
        return new ResponseEntity<ClientEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<ClientEntity> save(@Valid @RequestBody ClientEntity clientEntity) {
        return new ResponseEntity<ClientEntity>(
                this.clientRepository.save(clientEntity),new HttpHeaders(),HttpStatus.CREATED
        );
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ClientEntity> update(@PathVariable("id") long id, @RequestBody ClientEntity clientEntity) throws Exception{
        if(id == 0 || this.clientRepository.existsById(id)) {
            throw new Exception("Code not found");
        }

        return new ResponseEntity<ClientEntity>(
                this.clientRepository.save(clientEntity),new HttpHeaders(), HttpStatus.OK
        );
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<ClientEntity> delete(@PathVariable("id") long id) {
        return new ResponseEntity<ClientEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}
