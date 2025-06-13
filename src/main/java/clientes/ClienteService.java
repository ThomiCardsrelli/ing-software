package clientes;

public class ClienteService {
    private IRepositorioClientes repositorio;

    public ClienteService(IRepositorioClientes repositorio) {
        this.repositorio = repositorio;
    }

    public void registrarCliente(String nombre, String email) {
        Cliente cliente = new Cliente(nombre, email);
        repositorio.agregarCliente(cliente);
    }

    public Cliente buscarCliente(String email) {
        return repositorio.buscarPorEmail(email);
    }
}
