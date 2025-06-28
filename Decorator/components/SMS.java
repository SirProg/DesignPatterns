package Decorator.components;

public class SMS implements Notification {
    @Override
    public void enviarNotificacion(String mensaje) {
        mensaje = "SMS >> " + mensaje;
        System.out.println(mensaje);
    }
}