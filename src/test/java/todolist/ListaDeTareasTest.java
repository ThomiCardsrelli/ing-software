package todolist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListaDeTareasTest {

    @Test
    void testAgregarTarea() {
        ListaDeTareas lista = new ListaDeTareas(null);
        lista.agregarTarea("Estudiar Java");

        List<Tarea> tareas = lista.obtenerTareas();
        assertEquals(1, tareas.size());
        assertEquals("Estudiar Java", tareas.get(0).getDescripcion());
        assertFalse(tareas.get(0).estaCompletada());
    }

    @Test
    void testCompletarTarea() {
        ListaDeTareas lista = new ListaDeTareas(null);
        lista.agregarTarea("Leer libro");
        lista.completarTarea(0);
        assertTrue(lista.obtenerTareas().get(0).estaCompletada());
    }

    @Test
    void testCompletarTareaConIndiceInvalido() {
        ListaDeTareas lista = new ListaDeTareas(null);
        assertThrows(IndexOutOfBoundsException.class, () -> lista.completarTarea(3));
    }

    @Test
    void testCompletarTareaIndiceNegativo() {
        ListaDeTareas lista = new ListaDeTareas(null);
        lista.agregarTarea("Leer libro");

        assertThrows(IndexOutOfBoundsException.class, () -> {
            lista.completarTarea(-1);
        });
    }

    @Test
    void testAgregarTareaInvalida() {
        ListaDeTareas lista = new ListaDeTareas(null);
        assertThrows(IllegalArgumentException.class, () -> lista.agregarTarea(""));
    }
}
