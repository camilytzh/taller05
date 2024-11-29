package Notificaciones;

import java.util.ArrayList;
import java.util.List;

public class NotificaionTarea2 implements NotificacionTareas{
    
    private List<Suscriptor> suscriptores = new ArrayList<>();
 
    @Override
    public void enlazar(Suscriptor s) {
        suscriptores.add(s);
    }
 
    @Override
    public void desenlazar(Suscriptor s) {
        suscriptores.remove(s);
    }
 
    @Override
    public void notificacion(String m,String c) {
        for(Suscriptor s: suscriptores) {
            s.actualizar(m,c);
        }
    }

}
