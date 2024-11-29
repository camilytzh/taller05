package CreadorTareas;

import java.util.Date;

public abstract class Tarea {

    private String titulo;
    private int prioridad;
    private Date fechaVencimiento;
    private String estado;

    public Tarea(String titulo, int prioridad, Date fechaVencimiento, String estado) {
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
    }

    public abstract void ejecutar();
}
