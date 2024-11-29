package Notificaciones;

public class Usuario1 implements Suscriptor{

    @Override
    public void actualizar(String s,String c) {
        System.out.println("Mensaje sobre: " + s + " fue enviado a" + c);
    }
    
}