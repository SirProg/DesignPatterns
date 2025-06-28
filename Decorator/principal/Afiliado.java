package Decorator.principal;

import Decorator.components.Email;
import Decorator.components.Notification;
import Decorator.components.SMS;
import Decorator.decorators.NotificationDecorator;
import Decorator.decorators.Signal;
import Decorator.decorators.Telegram;
import Decorator.decorators.Whatsapp;
import Decorator.decorators.Wire;

public class Afiliado{
    public static void main(String[] args) {
        Boolean enableWhatsapp = true;
        Boolean enableWire = false;
        Boolean enableTelegram = false;
        Boolean enableSignal = true;

        String mensaje = "Su pago se vence en 10 dias";
        // Predeterminado
        Notification notification = new SMS();
        notification = new Email();

        //Adicional por el usuario
        if(enableWhatsapp){
            notification = new Whatsapp(notification);
        }
        if(enableWire){
            notification = new Wire(notification);
        }
        if(enableSignal){
            notification = new Signal(notification);
        }
        if(enableTelegram){
            notification = new Telegram(notification);
        }
        notification.enviarNotificacion(mensaje);
    }
}