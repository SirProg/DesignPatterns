package Decorator.decorators;

import Decorator.components.Notification;

public class Wire extends NotificationDecorator{
    public Wire(Notification wrappee) {
        super(wrappee);
    }
    
    @Override
    public void enviarNotificacion(String mensaje) {
        super.enviarNotificacion(mensaje);
        mensaje = "Wire >> " + mensaje;
        System.out.println(mensaje);
    }

}