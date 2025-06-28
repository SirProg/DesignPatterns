package bridge;

public class Telefonico implements Canal {
    public void procesar(String transaccion){
        System.out.println("Procesando: "+transaccion);
    }
}
