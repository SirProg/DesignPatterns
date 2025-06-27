package Decorator.decorators;

import Decorator.components.Notification;

public class NotificationDecorator implements Notification{
    protected Notification envoltorio;

    public NotificationDecorator(Notification notification){
        this.envoltorio = notification;
    }

    @Override
    public String enviarNotificacion(String mensaje) {
        return envoltorio.enviarNotificacion(mensaje);
    }
}