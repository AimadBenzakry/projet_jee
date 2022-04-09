package com.example.projet_jee.ws;

import com.example.projet_jee.bean.Client;
import com.example.projet_jee.service.facade.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/client")
public class ClientWs {

    @PostMapping("/")
    public int save(@RequestBody Client client) {
        return clientService.save(client);
    }

    @PutMapping("/")
    public void update(@RequestBody Client client) {
        clientService.update(client);
    }

    @GetMapping("/cin/{cin}")
    public Client findByCin(@PathVariable String cin) {
        return clientService.findByCin(cin);
    }

    @DeleteMapping("/cin/{cin}")
    public int deleteByCin(@PathVariable String cin) {
        return clientService.deleteByCin(cin);
    }

    @Autowired
    private ClientService clientService;
}
