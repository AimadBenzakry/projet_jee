package com.example.projet_jee.service.facade;

import com.example.projet_jee.bean.Client;

import java.util.List;

public interface ClientService {

    int save(Client client);
    void update(Client client);

    Client findByCin(String cin);
    int deleteByCin(String cin);

}
