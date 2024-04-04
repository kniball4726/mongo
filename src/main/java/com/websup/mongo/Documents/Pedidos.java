package com.websup.mongo.Documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Pedidos")
public class Pedidos {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getBultos() {
        return bultos;
    }

    public void setBultos(int bultos) {
        this.bultos = bultos;
    }

    public int getNumeroped() {
        return numeroped;
    }

    public void setNumeroped(int numeroped) {
        this.numeroped = numeroped;
    }

    public String getPreparador() {
        return preparador;
    }

    public void setPreparador(String preparador) {
        this.preparador = preparador;
    }

    public String getFprepara() {
        return fprepara;
    }

    public void setFprepara(String fprepara) {
        this.fprepara = fprepara;
    }

    public String getFentrega() {
        return fentrega;
    }

    public void setFentrega(String fentrega) {
        this.fentrega = fentrega;
    }

    public String getFdescuento() {
        return fdescuento;
    }

    public void setFdescuento(String fdescuento) {
        this.fdescuento = fdescuento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
}
