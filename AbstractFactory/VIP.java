package AbstractFactory;

public class VIP extends Tarjeta_Credito {

    @Override
    public Tarjeta_Credito crearTarjeta() {
        return new VIP();
    }
}