package todolist;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTareas {
    private List<Tarea> tareas = new ArrayList<>();
    private Notificador notificador;

    public ListaDeTareas(Notificador notificador) {
        this.notificador = notificador;
    }

    public void agregarTarea(String descripcion) {
        Tarea tarea = new Tarea(descripcion);
        tareas.add(tarea);
        if (notificador != null) {
            notificador.notificarNuevaTarea(descripcion);
        }
    }

    public void completarTarea(int indice) {
        if (indice < 0 || indice >= tareas.size()) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        tareas.get(indice).marcarComoCompletada();
    }

    public List<Tarea> obtenerTareas() {
        return tareas;
    }
}
