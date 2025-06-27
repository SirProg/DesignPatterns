package Decorator.decorators;

import Decorator.components.Notification;

public class Signal extends NotificationDecorator{
    public Signal(Notification wrappee) {
        super(wrappee);
    }
    
    @Override
    public String enviarNotificacion(String mensaje) {
        mensaje = "Signal >> " + mensaje;
        System.out.println(mensaje);
        return mensaje;
    }

}