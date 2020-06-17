package leidens.cristian.exemploh2mysql.service;

import leidens.cristian.exemploh2mysql.model.ClientEntity;
import leidens.cristian.exemploh2mysql.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientFindAllService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientEntity> findAll() {
        return (List<ClientEntity>) this.clientRepository.findAll();
    }

}
