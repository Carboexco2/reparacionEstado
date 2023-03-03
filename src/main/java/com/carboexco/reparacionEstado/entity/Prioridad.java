package com.carboexco.reparacionEstado.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "prioridad")
public class Prioridad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prioridad", nullable = false)
    private Integer id;

    @Column(name = "nombre_prioridad", nullable = false, length = 10)
    private String nombrePrioridad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombrePrioridad() {
        return nombrePrioridad;
    }

    public void setNombrePrioridad(String nombrePrioridad) {
        this.nombrePrioridad = nombrePrioridad;
    }

}