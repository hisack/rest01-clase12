package com.programacion.rest;

import com.programacion.entidades.Cliente;
import com.programacion.entidades.HolaMundoDto;
import com.programacion.servicios.ServicioCliente;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Date;
import java.util.List;

@Path("/cliente")
public class HolaMundoRest {
/*
    @GET
    @Path("/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public HolaMundoDto holaMundo(@PathParam("nombre") String nombre){
        HolaMundoDto ret = new HolaMundoDto();
        ret.setMensaje(String.format("Hola Mundo: %s", nombre));
        ret.setFecha(new Date());
        return  ret;
    }

    @POST //-- insertar
    @Path("/guardar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public HolaMundoDto guardar(HolaMundoDto hola){
        HolaMundoDto ret = new HolaMundoDto();
        ret.setMensaje(hola.getMensaje());
        ret.setFecha(hola.getFecha());
        return  ret;
    }

    /*hacer un post un put un delete*/
    //------Clientes

    ServicioCliente servicio = new ServicioCliente();

    @GET
    //@Path("/clientes")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cliente> findAll() {
        return servicio.findAll();
    }


    @POST //-- insertar
    @Path("/insertar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Cliente guardar(Cliente cliente){
       Cliente clienteNuevo= servicio.agregarCliente(cliente);
       // return Response.status(Response.Status.CREATED).build();
        return clienteNuevo;
    }


    @DELETE
    @Path("/{cedula}")
    public Response borrar(@PathParam("cedula") String cedula){
        servicio.borrar(cedula);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @PUT
    @Path("/{cedula}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("cedula") String cedula, Cliente cli) {
        servicio.actualizar (cli);
        return Response.status(Response.Status.OK).build();
    }

}