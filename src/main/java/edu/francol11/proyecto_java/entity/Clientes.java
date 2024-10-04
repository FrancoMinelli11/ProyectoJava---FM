package edu.francol11.proyecto_java.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CLIENTES")

public class Clientes {

    public Clientes () {}

    public Clientes(int id, int legajo, String nombre, String apellido) {
        this.id = id;
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "LEGAJO")
    private int legajo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
}
