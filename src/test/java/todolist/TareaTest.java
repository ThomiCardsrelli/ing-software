package todolist;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TareaTest {
    @Test
    void testTareaDescripcionValida() {
        Tarea tarea = new Tarea("Estudiar");
        assertEquals("Estudiar", tarea.getDescripcion());
    }

    @Test
    void testTareaDescripcionNula() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Tarea(null);
        });
    }
    @Test
    void testTareaDescripcionVacia() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Tarea("   "); // Solo espacios
        });
    }

}
