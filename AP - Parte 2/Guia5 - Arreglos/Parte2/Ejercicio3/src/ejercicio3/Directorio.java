package ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/*
 * @author Abi Castro
 */
public class Directorio {

    HashMap<String, Cliente> directorio;

    public Directorio() {
        this.directorio = new HashMap();
    }

    public void agregarCliente(String nroTel, Cliente persona) {
        this.directorio.put(nroTel, persona);
    }

    public Cliente buscarCliente(String nroTel) {
        return this.directorio.get(nroTel);
    }

    public List<String> buscarTeléfono(String apellido) {
        ArrayList<String> telefonos = new ArrayList<>();

        for (Map.Entry<String, Cliente> entry : directorio.entrySet()) {
            Cliente cliente = entry.getValue();
            if (cliente.getApellido().equals(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }

    public List<Cliente> buscarClientes(String ciudad) {
        List<Cliente> clientes = new ArrayList<>();
        for (Cliente cliente : directorio.values()) {
            if (cliente.getCiudad().equals(ciudad)) {
                clientes.add(cliente);
            }
        }
        return clientes;
    }

    public void borrarCliente(String telefono) {
        directorio.remove(telefono);
    }

}
