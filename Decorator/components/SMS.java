package Decorator.components;

public class SMS implements Notification {
    @Override
    public String enviarNotificacion(String mensaje) {
        mensaje = "SMS >> " + mensaje;
        System.out.println(mensaje);
        return mensaje;
    }
}