package leidens.cristian.exemploh2mysql.service;

import leidens.cristian.exemploh2mysql.model.ClientEntity;
import leidens.cristian.exemploh2mysql.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientSaveService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientEntity save(ClientEntity clientEntity) {
        return this.clientRepository.save(clientEntity);
    }

}
