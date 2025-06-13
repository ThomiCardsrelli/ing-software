package clientes;

import java.util.List;

public interface IRepositorioClientes {
    void agregarCliente(Cliente cliente);
    Cliente buscarPorEmail(String email);
    List<Cliente> obtenerTodos();
}
