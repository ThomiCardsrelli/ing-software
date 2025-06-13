package clientes;

import java.util.List;

public class App {
    public static void main(String[] args) {
        IRepositorioClientes repo = new RepositorioClientes();
        ClienteService service = new ClienteService(repo);

        service.registrarCliente("Nico", "nico@email.com");
        service.registrarCliente("Mel", "mel@tienda.com");


        Cliente buscado = service.buscarCliente("mel@tienda.com");
        if (buscado != null) {
            System.out.println("Cliente encontrado: " + buscado);
        } else {
            System.out.println("Cliente no encontrado.");
        }

        System.out.println("\nLista de todos los clientes:");
        List<Cliente> todos = repo.obtenerTodos();
        for (Cliente c : todos) {
            System.out.println("- " + c);
        }
    }
}
