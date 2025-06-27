package AbstractFactory;

public class Basica extends Tarjeta_Credito{
    @Override
    public Tarjeta_Credito crearTarjeta() {
        return new Basica();
    }
}