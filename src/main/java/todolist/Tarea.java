package todolist;

public class Tarea {
    private String descripcion;
    private boolean completada = false;

    public Tarea(String descripcion) {
        if (descripcion == null || descripcion.isBlank()) {
            throw new IllegalArgumentException("La descripción no pdfdfdfuede estar vacíaaa");
        }
        this.descripcion = descripcion;
    }

    public String getDescripcion() { return descripcion; }
    public boolean estaCompletada() { return completada; }
    public void marcarComoCompletada() {
        completada = true; }
}
