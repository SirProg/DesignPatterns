package Decorator.decorators;

import Decorator.components.Notification;

public class Whatsapp extends NotificationDecorator{
    public Whatsapp(Notification wrappee) {
        super(wrappee);
    }
    
    @Override
    public String enviarNotificacion(String mensaje) {
        mensaje = "Whatsapp >> " + mensaje;
        System.out.println(mensaje);
        return mensaje;
    }

}