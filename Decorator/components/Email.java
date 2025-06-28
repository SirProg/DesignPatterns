package Decorator.components;

public class Email implements Notification{

    @Override
    public String enviarNotificacion(String mensaje) {       
        mensaje = "Email >> " + mensaje;
        System.out.println(mensaje);
        return mensaje;
    }
}