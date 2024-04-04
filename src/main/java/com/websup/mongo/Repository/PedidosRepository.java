package com.websup.mongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.websup.mongo.Documents.Pedidos;

public interface PedidosRepository extends MongoRepository<Pedidos, Integer> {

}
