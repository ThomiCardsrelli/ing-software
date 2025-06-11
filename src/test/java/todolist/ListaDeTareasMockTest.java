package todolist;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class ListaDeTareasMockTest {

    @Test
    void testNotificadorEsLlamado() {
        Notificador notificadorMock = mock(Notificador.class);
        ListaDeTareas lista = new ListaDeTareas(notificadorMock);

        lista.agregarTarea("Hacer ejercicio");

        verify(notificadorMock).notificarNuevaTarea("Hacer ejercicio");
    }
}
