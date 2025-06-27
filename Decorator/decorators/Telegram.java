package Decorator.decorators;

import Decorator.components.Notification;

public class Telegram extends NotificationDecorator{
    public Telegram(Notification wrappee) {
        super(wrappee);
    }
    
    @Override
    public String enviarNotificacion(String mensaje) {
        mensaje = "Telegram >> " + mensaje;
        System.out.println(mensaje);
        return mensaje;
    }

}