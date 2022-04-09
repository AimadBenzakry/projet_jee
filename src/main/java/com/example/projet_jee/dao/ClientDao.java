package com.example.projet_jee.dao;

import com.example.projet_jee.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientDao extends JpaRepository<Client,Long> {
    Client findByCin(String cin);
    int deleteByCin(String cin);


}
