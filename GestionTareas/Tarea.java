package GestionTareas;

import java.util.Date;

public class Tarea {
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
