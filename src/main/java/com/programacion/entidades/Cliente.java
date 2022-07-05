package com.programacion.entidades;

import lombok.Getter;
import lombok.Setter;

public class Cliente {
    @Getter @Setter private String cedula;
    @Getter @Setter private String nombre;
    @Getter @Setter private String apellido;

    /*
    public Cliente(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente() {
    }
    */


}
