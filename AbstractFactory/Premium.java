package AbstractFactory;

public class Premium extends Tarjeta_Credito {
    
    @Override
    public Tarjeta_Credito crearTarjeta() {
        return new Premium();
    }
    
}