package com.websup.mongo.Documents;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Data
@ToString
@Document(collection = "Pedidos")
public class Pedidos implements Serializable{

    @Id
    private int id;
    private int orden;
    private String cliente;
    private int bultos;
    private int numeroped;
    private String preparador;
    private String fprepara;
    private String fentrega;
    private String fdescuento;
    private String direccion;

    public Pedidos(int id, int orden, String cliente, int bultos, int numeroped, String preparador, String fprepara,
            String fentrega, String fdescuento, String direccion) {
        this.id = id;
        this.orden = orden;
        this.cliente = cliente;
        this.bultos = bultos;
        this.numeroped = numeroped;
        this.preparador = preparador;
        this.fprepara = fprepara;
        this.fentrega = fentrega;
        this.fdescuento = fdescuento;
        this.direccion = direccion;
    }

    public Pedidos (){

    }
}
