package Notificaciones;

public class Usuario2 implements Suscriptor{
    
    @Override
    public void actualizar(String s,String c) {
        System.out.println("Mensaje sobre: " + s + " fue enviado a" + c);
    }

}
