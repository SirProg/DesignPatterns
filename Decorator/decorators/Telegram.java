package Decorator.decorators;

import Decorator.components.Notification;

public class Telegram extends NotificationDecorator{
    public Telegram(Notification wrappee) {
        super(wrappee);
    }
    
    @Override
    public void enviarNotificacion(String mensaje) {
        mensaje = "Telegram >> " + mensaje;
        System.out.println(mensaje);
    }

}