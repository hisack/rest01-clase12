package com.programacion.entidades;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class HolaMundoDto {

    @Getter @Setter private String mensaje;
    @Getter @Setter private Date fecha;
}
