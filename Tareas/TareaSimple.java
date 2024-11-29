package Tareas;

import java.util.Date;

public class TareaSimple extends Tarea {

    public TareaSimple(String titulo, int prioridad, Date fechaVencimiento, String estado) {
        super(titulo, prioridad, fechaVencimiento, estado);
    }

    @Override
    public void ejecutar() {

        //logic

    }
}
