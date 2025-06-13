package clientes;

import java.util.ArrayList;
import java.util.List;

public class RepositorioClientes implements IRepositorioClientes {
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public Cliente buscarPorEmail(String email) {
        for (Cliente c : clientes) {
            if (c.getEmail().equalsIgnoreCase(email)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Cliente> obtenerTodos() {
        return clientes;
    }
}
