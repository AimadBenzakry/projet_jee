package com.example.projet_jee.service.impl;

import com.example.projet_jee.bean.Client;
import com.example.projet_jee.dao.ClientDao;
import com.example.projet_jee.service.facade.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public int save(Client client) {
        if(findByCin(client.getCin()) != null ){
            return -1;
        } else if (client.getCin() == null || client.getCin().isEmpty()){
            return -2;
        }
        else {
            clientDao.save(client);
            return 1;
        }
    }

    @Override
    public void update(Client client) {
        if (findByCin(client.getCin()) != null)
            clientDao.save(client);
    }

    @Override
    public Client findByCin(String cin) {
        return clientDao.findByCin(cin);
    }

    @Transactional
    @Override
    public int deleteByCin(String cin) {
        return clientDao.deleteByCin(cin);
    }

    @Autowired
    private ClientDao clientDao;

}


