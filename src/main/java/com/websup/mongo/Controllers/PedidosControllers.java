package com.websup.mongo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.websup.mongo.Documents.Pedidos;
import com.websup.mongo.Repository.PedidosRepository;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1")
public class PedidosControllers {
    @Autowired
    private PedidosRepository pedidosRepo;

    @GetMapping(value = "/all")
    public List<Pedidos> getAll() {
        return pedidosRepo.findAll();
    }

    @PostMapping(value = "/new")
    public ResponseEntity<?> setPedidos(@RequestBody Pedidos pedidos) {
        try {
            Pedidos pedidossave = pedidosRepo.save(pedidos);
            return new ResponseEntity<Pedidos>(pedidossave, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getCause().toString(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
       
    }

    @PutMapping(value = "/update/{id}")
    public String updatePedido(@PathVariable Integer id, @RequestBody Pedidos pedidos) {
        Pedidos updatePedido = pedidosRepo.findById(id).get();
        updatePedido.setBultos(pedidos.getBultos());
        updatePedido.setCliente(pedidos.getCliente());
        updatePedido.setDireccion(pedidos.getDireccion());
        updatePedido.setFdescuento(pedidos.getFdescuento());
        updatePedido.setFentrega(pedidos.getFentrega());
        updatePedido.setFprepara(pedidos.getFprepara());
        updatePedido.setNumeroped(pedidos.getNumeroped());
        updatePedido.setOrden(pedidos.getOrden());
        updatePedido.setPreparador(pedidos.getPreparador());
        pedidosRepo.save(updatePedido);
        return "Updated Succesfull";

    }

    @DeleteMapping(value = "/delete/{id}")
    public String deletePedido(@PathVariable Integer id) {
        Pedidos deletePedido = pedidosRepo.findById(id).get();
        pedidosRepo.delete(deletePedido);
        return "Delete Succesfull";
    }

}
