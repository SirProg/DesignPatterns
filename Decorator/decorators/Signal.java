package Decorator.decorators;

import Decorator.components.Notification;

public class Signal extends NotificationDecorator{
    public Signal(Notification wrappee) {
        super(wrappee);
    }
    
    @Override
    public void enviarNotificacion(String mensaje) {
        mensaje = "Signal >> " + mensaje;
        System.out.println(mensaje);
    }

}