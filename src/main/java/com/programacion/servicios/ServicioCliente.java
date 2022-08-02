
package com.programacion.servicios;

        import com.programacion.entidades.Cliente;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class ServicioCliente {

    private Map<String, Cliente> clientes = new HashMap<>();;

    {
        Cliente c = new Cliente();

        c.setCedula("1705553731");
        c.setNombre("Andres");
        c.setApellido("Mendez");

        clientes.put(c.getCedula(), c);

    }

    public Cliente agregarCliente(Cliente cliente){
            clientes.put(cliente.getCedula(), cliente);
            Cliente cli= clientes.get(cliente.getCedula());
           return cli;
    }

    public List<Cliente> findAll() {
        List<Cliente> ret = new ArrayList<Cliente>();
        ret.addAll(clientes.values());
        return ret;
    }

    public void borrar(String cedula){
        clientes.remove(cedula);
    }

    public void actualizar(Cliente cliente){
        clientes.put(cliente.getCedula(), cliente);

    }
}
