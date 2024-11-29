package CreadorTareas;

import java.util.Date;

public class TareaCompleja extends Tarea{


    public TareaCompleja(String titulo, int prioridad, Date fechaVencimiento, String estado) {
        super(titulo, prioridad, fechaVencimiento, estado);
    }

    @Override
    public void ejecutar() {

        //logic

    }
}
