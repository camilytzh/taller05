package Notificaciones;

public interface NotificacionTareas {

    public void enlazar(Suscriptor s);  
    public void desenlazar(Suscriptor s);
    public void notificacion(String m,String c);
    
}