package leidens.cristian.exemploh2mysql.service;

import leidens.cristian.exemploh2mysql.model.ClientEntity;
import leidens.cristian.exemploh2mysql.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//SpringBoot
@Service
public class ClientFindByIdService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientEntity findByID(long id) {
        return this.clientRepository.findById(id).get();
    }

}
