package com.websup.mongo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.websup.mongo.Documents.Pedidos;
import com.websup.mongo.Repository.PedidosRepository;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1")
public class PedidosControllers {
    @Autowired
    private PedidosRepository pedidosRepo;

    @GetMapping("/")
    public List<Pedidos> getAll() {
        return pedidosRepo.findAll();
    }
    
    @PostMapping("/new")
    public ResponseEntity<?> setPedidos(@RequestBody Pedidos pedidos) {
        try {
            Pedidos pedidossave = pedidosRepo.save(pedidos);
            return new ResponseEntity<Pedidos>(pedidossave, HttpStatus.CREATED);            
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getCause().toString(),
                HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    

}
