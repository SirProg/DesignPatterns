package Decorator.components;

public class Email implements Notification{

    @Override
    public void enviarNotificacion(String mensaje) {
        mensaje = "Email >> " + mensaje;
        System.out.println(mensaje);
    }
}
