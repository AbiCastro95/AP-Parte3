package ejercicio3;

import java.util.List;

/*
 * @author Abi Castro
 */
public class Test {

    public static void main(String[] args) {
        Directorio directorio = new Directorio();

        // Agregar clientes al directorio
        Cliente cliente1 = new Cliente("1111111", "Juan", "Pérez", "Ciudad A", "Dirección 1");
        Cliente cliente2 = new Cliente("2222222", "María", "López", "Ciudad B", "Dirección 2");
        
        directorio.agregarCliente("123456789", cliente1);
        directorio.agregarCliente("987654321", cliente2);

        // Buscar cliente por número de teléfono
        Cliente clienteEncontrado = directorio.buscarCliente("123456789");
        System.out.println("Cliente encontrado: " + clienteEncontrado);

        // Buscar teléfonos por apellido
        List<String> telefonos = directorio.buscarTeléfono("Pérez");
        System.out.println("Teléfonos encontrados para el apellido Pérez:");
        for (String telefono : telefonos) {
            System.out.println(telefono);
        }

        // Buscar clientes por ciudad
        List<Cliente> clientesEncontrados = directorio.buscarClientes("Ciudad B");
        System.out.println("Clientes encontrados en la ciudad B:");
        for (Cliente cliente : clientesEncontrados) {
            System.out.println(cliente);
        }

        // Borrar cliente por número de teléfono
        directorio.borrarCliente("987654321");
        System.out.println("Cliente eliminado del directorio.");

        // Verificar si el cliente fue eliminado
        clienteEncontrado = directorio.buscarCliente("987654321");
        if (clienteEncontrado == null) {
            System.out.println("Cliente no encontrado en el directorio.");
        }
    }
    
}
